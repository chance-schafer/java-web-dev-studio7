package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD() {
        super();
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc(){
        System.out.println(getGenre());
    }
}
