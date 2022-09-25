public class Printer {

    String queue = "";
    int pagesInQueue = 0;
    int pagesIsFinished = 0;

    public void append(String text, String nameDoc, int numberPages) {
        queue = queue + "\n" + nameDoc + " - " + text;
        pagesInQueue += numberPages;
    }

    public void append(String text, int numberPages) {
        append(text, "Документ без имени", numberPages);
    }

    public void append(String text, String nameDoc) {
        append(text, nameDoc, 1);

    }

    public void append(String text) {
        append(text, "Документ без имени", 1);

    }


    public void clear() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print() {
        System.out.println(queue);
        pagesIsFinished+=pagesInQueue;
        clear();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getPrintedPagesCount() {
        return pagesIsFinished;
    }
}
