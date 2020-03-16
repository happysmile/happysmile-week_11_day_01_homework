public class Printer {

    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public void print(int numberOfSheets, int numberOfCopies) {

        int sheetsNeeded;
        int tonerNeeded;
        int tonerPerSheet;
        // this is just in case you want to change the toner/page ratio
        // currently pagesNeeded = tonerNeeded
        tonerPerSheet = 1;
        sheetsNeeded = numberOfCopies * numberOfSheets;
        tonerNeeded = sheetsNeeded * tonerPerSheet;

        if( (sheetsNeeded <= this.sheetsLeft) && (tonerNeeded <= this.tonerVolume) ){
            this.useSheets(sheetsNeeded);
            this.reduceToner(tonerNeeded);
        }

    }

    private void reduceToner(int numberOfSheets){
        this.tonerVolume = this.tonerVolume - numberOfSheets;
    }

    private void useSheets(int numberOfSheets){
        this.sheetsLeft = this.sheetsLeft - numberOfSheets;
    }

    public void addSheets(int numberOfSheets){
        this.sheetsLeft = this.sheetsLeft + numberOfSheets;
    }

    public void addToner(int tonerVolume){
        this.tonerVolume = this.tonerVolume + tonerVolume;
    }

    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

}



//Printer
//Create a Printer class that has a property for number of sheets of paper left.
//Add a method to print that takes in a number of pages and number of copies.
//The print method will only run if the printer has enough paper.
// If it runs it will reduce the value of the paper left by number of copies * number of pages.
//Add a toner volume property to the class.
//Modify the printer so that it reduces the toner by 1 for each page printed.