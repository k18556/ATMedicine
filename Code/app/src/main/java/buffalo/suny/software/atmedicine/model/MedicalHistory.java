package buffalo.suny.software.atmedicine.model;

public class MedicalHistory {
    private String symptom, bodyPart, date;

    public MedicalHistory() {

    }

    public String getSymptom() {
        return symptom;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public String getDate() {
        return date;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setBodyPart(String lastHappen) {
        this.bodyPart = lastHappen;
    }

    public void setDate(String date) {
        this.date = date;
    }
}