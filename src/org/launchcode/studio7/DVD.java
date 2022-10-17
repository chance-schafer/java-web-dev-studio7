package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    private String title;
    public DVD() {
        super();
    }

    public DVD(String title) {
        this();
        this.title = title;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void spinDisc() {
        System.out.println(getTitle());
    };

}
