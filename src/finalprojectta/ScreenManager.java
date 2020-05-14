package finalprojectta;

class ScreenManager {
    
    GameUI ui;
    
    public ScreenManager(GameUI GameInterface){
        
        ui = GameInterface;
    }
    public void TitleScreen(){
        
        ui.TitlePanel.setVisible(true);
        ui.StartPanel.setVisible(true);
        ui.BackgroundPanel.setVisible(true);
        
        ui.TextPanel.setVisible(false);
        ui.ChoicePanel.setVisible(false);
        
    }
    public void InGameScreen(){
    
        ui.TitlePanel.setVisible(false);
        ui.StartPanel.setVisible(false);
        ui.BackgroundPanel.setVisible(false);
        
        ui.TextPanel.setVisible(true);
        ui.ChoicePanel.setVisible(true);
        
    }
}
