import java.util.Scanner;

public class PrintServerQueue2 {

	public static void displayMenu() {
		System.out.println("\nWelcome to PrintServer! Please select a number from the list.");
		System.out.println("1. Enqueue a job");
		System.out.println("2. Dequeue a job");
		System.out.println("3. Peek at the job at front of the queue");
		System.out.println("4. Empty the queue");
		System.out.println("5. Display all jobs");
		System.out.println("6. Quit the program");
	}

	public static void main(String[] args) {
		QueueArrayBased queue = new QueueArrayBased();
		Scanner scanner = new Scanner(System.in);
		int response;

		do {
			displayMenu();
			response = scanner.nextInt();
			scanner.nextLine(); 

			try {
				switch (response) {
				case 1:
					System.out.println("Enter the job id:");
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter document name:");
					String doc_name = scanner.nextLine();
					System.out.println("Enter the number of pages:");
					int pages = scanner.nextInt();
					scanner.nextLine();

					queue.enqueue(new PrintJob(id, doc_name, pages));
					System.out.println("Job added.");
					break;

				case 2:
					System.out.println("Removed: " + queue.dequeue());
					break;

				case 3:
					System.out.println("Front job: " + queue.peek());
					break;

				case 4:
					queue.dequeueAll();
					System.out.println("Queue emptied.");
					break;

				case 5:
					queue.displayQueue();
					break;

				case 6:
					System.out.println("Goodbye!");
					break;

				default:
					System.out.println("Invalid option, choose 1-6.");
				}
			} catch (QueueException e) {
				System.out.println(e.getMessage());
			}

		} while (response != 6);

		scanner.close();
	}
}
