// code here
String hostname = "localhost";
int port = 3742;
File f = new File("/opt/File.txt");
CSGClient.start(hostname, port, f);
// Set a low number to ensure the Server is used. this defaults to 200
CSG.setMinPolygonsForOffloading(500);