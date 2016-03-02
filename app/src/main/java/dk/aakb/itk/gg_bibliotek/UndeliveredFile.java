package dk.aakb.itk.gg_bibliotek;

import dk.aakb.itk.brilleappen.Event;

public class UndeliveredFile {
    private String filePath;
    private String eventUrl;
    private Event event;

    public UndeliveredFile(Event event, String eventUrl, String filePath) {
        this.event = event;
        this.eventUrl = eventUrl;
        this.filePath = filePath;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "UndeliveredFile{" + filePath + "}";
    }
}
