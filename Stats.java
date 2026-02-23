public class Stats {
    private int validRecordsProcessed = 0;
    private int searchResults = 0;
    private int booksAdded = 0;
    private int errorsEncountered = 0;

    public Stats(int validRecordsProcessed, int searchResults, int booksAdded, int errorsEncountered) {
        this.validRecordsProcessed = validRecordsProcessed;
        this.searchResults = searchResults;
        this.booksAdded = booksAdded;
        this.errorsEncountered = errorsEncountered;
    }
    public int getValidRecordsProcessed() {return validRecordsProcessed;}
    public int getSearchResults() {return searchResults;}
    public int getBooksAdded() {return booksAdded;}
    public int getErrorsEncountered() {return errorsEncountered; }
    
    public void setValidRecordsProcessed(int validRecordsProcessed) {this.validRecordsProcessed = validRecordsProcessed;}
    public void setSearchResults(int searchResults) {this.searchResults = searchResults;}
    public void setBooksAdded(int booksAdded) {this.booksAdded = booksAdded;}
    public void setErrorsEncountered(int errorsEncountered) {this.errorsEncountered = errorsEncountered;}
}