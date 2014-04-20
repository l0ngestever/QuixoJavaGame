package spel.winnaar;

/**
 * Created by joey on 19-4-2014.
 */

import utils.Task;

import javax.swing.*;

public class ToonWinnaar extends Task {

    private JFrame spelFrame;

    private String strSpeler1;
    private String strSpeler2;
    private String strTypeSpeler1;
    private String strTypeSpeler2;
    private String strSpelerWinnaar;

    public ToonWinnaar(JFrame spelFrame, String strSpeler1, String strSpeler2, String strTypeSpeler1, String strTypeSpeler2, String strSpelerWinnaar){

        this.spelFrame = spelFrame;
        this.strSpeler1 = strSpeler1;
        this.strSpeler2 = strSpeler2;
        this.strTypeSpeler1 = strTypeSpeler1;
        this.strTypeSpeler2 = strTypeSpeler2;
        this.strSpelerWinnaar = strSpelerWinnaar;
    }

    public void run() {
        execute();

        boolean validate = validate();

        if(validate == true)
        {
            execute();
        }
    }

    private boolean validate() {

        return true;
    }

    private void execute() {

        spelFrame.setContentPane(new Winnaar(spelFrame, strSpeler1, strSpeler2, strTypeSpeler1, strTypeSpeler2, strSpelerWinnaar));
        spelFrame.validate();
    }

}
