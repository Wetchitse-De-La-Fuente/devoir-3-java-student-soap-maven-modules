<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Student SOAP Service</title>
    <style>
        body{font-family:Arial,sans-serif;background:#f4f7fb;color:#172033;margin:0;padding:40px}
        .card{max-width:850px;margin:auto;background:white;padding:30px;border-radius:18px;box-shadow:0 15px 40px rgba(20,35,70,.10)}
        h1{margin-top:0} code{background:#eef3fb;padding:3px 7px;border-radius:5px}.ok{color:#16833a;font-weight:700}
    </style>
</head>
<body>
<div class="card">
    <h1>Student SOAP Web Service</h1>
    <p class="ok">Service prêt à être testé avec SoapUI.</p>
    <p>Endpoint : <code>/studentWebService</code></p>
    <p>WSDL : <code>/studentWebService?wsdl</code></p>
    <p>Opérations : <code>studentRequestGet</code> et <code>studentRequestSav</code>.</p>
</div>
</body>
</html>
