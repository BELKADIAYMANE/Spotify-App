package media;

public class Image {
	
private String path;

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

@Override
public String toString() {
	return "Path: " + path;
}

}
