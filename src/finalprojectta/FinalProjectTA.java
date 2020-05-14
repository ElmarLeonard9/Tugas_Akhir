package finalprojectta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalProjectTA {
    
    GameUI ui = new GameUI();
    ScreenManager sm = new ScreenManager(ui);
    ChoiceHandler cHandler = new ChoiceHandler();
    GameStory gs = new GameStory(this, ui, sm);
    Music mu = new Music();
    String nextPosition1,nextPosition2,nextPosition3,nextPosition4;
            
    public static void main(String[] args) {
        
        new FinalProjectTA();
        
    }
    public FinalProjectTA(){
        
        ui.Interface(cHandler);
        sm.TitleScreen();
        mu.SetFile(mu.SpookySpookySkeleton);
        mu.play();
        mu.loop();
    }
    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent e){
        
            String myChoice = e.getActionCommand();
            switch(myChoice){
                case"Start" : sm.InGameScreen(); gs.Prologue(); break;
                case"c1" : gs.selectPosition(nextPosition1); break;
                case"c2" : gs.selectPosition(nextPosition2); break;
                case"c3" : gs.selectPosition(nextPosition3); break;
                case"c4" : gs.selectPosition(nextPosition4); break;
            }
        }
    }
}

 

