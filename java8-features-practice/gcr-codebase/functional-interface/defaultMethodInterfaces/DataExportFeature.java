package defaultMethodInterfaces;

interface ReportExporter {
	void exportToCSV();

	void exportToPDF();

	default void exportToJSON() {
		System.out.println("Exporting report to json format");
	}
}

class SalesReport implements ReportExporter {

	public void exportToCSV() {
		System.out.println("Sales report exported to CSV");
	}

	public void exportToPDF() {
		System.out.println("Sales report exported to PDF");
	}
}

public class DataExportFeature {
	public static void main(String[] args) {

		ReportExporter report = new SalesReport();

		report.exportToCSV();
		report.exportToPDF();
		report.exportToJSON();
	}
}
