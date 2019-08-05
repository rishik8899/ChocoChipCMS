var app = require('express')();
const Proxy = require('http-proxy-middleware');

app.get('/', (req, res) => {																					//Landing Page proxy
  res.send('Hello World!')
});

app.get('/author', (req, res) => {																				//Authoring Proxy
  res.send('This is Authoring UI!')
});

var server = app.listen(2222, function () {
   var host = server.address().address
   var port = server.address().port

   console.log("Node started on http://localhost:%s", port)
})


/* ------- CMS PROXY ------------*/																				//CMS Proxy
var ccApp = require('express')();

ccApp.use('/*', Proxy({
	target: `http://localhost:4444`,
	secure: false
}));

var ccServer = ccApp.listen(2223, function() {

	var ccHost = ccServer.address().address
	var ccPort = ccServer.address().port

	console.log("ChocoChip CMS started on http://localhost:%s", ccPort)

})