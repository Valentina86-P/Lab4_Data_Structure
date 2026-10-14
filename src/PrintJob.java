
public class PrintJob {
	private int id;
	private String doc_name;
	private int pages;

	public PrintJob(int id, String doc_name, int pages) {
		this.id = id;
		this.doc_name = doc_name;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoc_name() {
		return doc_name;
	}

	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}






	public int getPages() {
		return pages;
	}






	public void setPages(int pages) {
		this.pages = pages;
	}






	@Override
	public String toString() {
		return doc_name;
	}
}