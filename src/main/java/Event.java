public class Event extends Task {

    private String endDate;
    public Event(String description)throws DukeException {
        super("default");


            String[] parsed = getParse(description);
            endDate = parsed[1];
            super.resetDesc(parsed[0]);

    }

    private String[] getParse(String desc) throws DukeException{
        if(!desc.contains("/at ")){
            throw new DukeException("Hello? Missing your /at command!");
        }
        String[] parsed= desc.split("/at ");
        return parsed;
    }

    //format project meeting (at: Mon 2-4pm)
    @Override
    public String toString() {
        return "[E]" +super.toString() + " (by: " + endDate+ ")";
    }


}