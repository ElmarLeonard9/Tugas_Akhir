package finalprojectta;

import java.awt.Image;
import javax.swing.ImageIcon;

public class GameStory {
    
    FinalProjectTA main;
    GameUI ui;
    ScreenManager sm;
    
    public GameStory(FinalProjectTA game,GameUI UserInterface,ScreenManager SManager){
        
        main = game;
        ui = UserInterface;
        sm = SManager;
    }
    
    public void selectPosition(String nextPosition){
    
        switch(nextPosition){
            case "prologue2" : Prologue2(); break;
            case "prologue3" : Prologue3(); break;
            case "prologue4" : Prologue4(); break;
            case "prologue5" : Prologue5(); break;
            case "prologue6" : Prologue6(); break;
            case "classroom" : Classroom(); break;
            case "searchClass" : SearchClass(); break;
            case "hallway" : Hallway(); break;
            case "firstFloor" : FirstFloor(); break;
            case "teacherRoom" : TeacherRoom(); break;
            case "pickPhone" : PickPhone(); break;
            case "hideTable" : HideTable(); break;
            case "stayQuiet" : StayQuiet(); break;
            case "badEnding" : BadEnding(); break;
            case "epilogue" : Epilogue(); break;
            case "titleScreen" : TitleScreen(); break;
            case "secondFloor" : SecondFloor(); break;
            case "locker" : Locker(); break;
            case "openLocker" : OpenLocker(); break;
            case "thirdFloor" : ThirdFloor(); break;
            case "girlToilet" : GirlToilet(); break;
            case "getEye" : GetEye(); break;
            case "giveEye" : GiveEye(); break;
            case "goodEnding" : GoodEnding(); break;
        }
    }
    
    public void Prologue(){
    
        ui.StoryText.setText("They said stories is just a fragment of the real world.\nWhether it's fiction or not it came from an ideas or reality.\nWhat could possibly happen if the story you heard was indeed real?\nWill it be a happy ending or gruesome death waiting for you...");
        ui.ChoiceButton1.setText("Continue");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "prologue2";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = ""; 
    }
    
    public void Prologue2(){
        ui.SceneImage = new ImageIcon(".//res//Bonbon.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("Summer of 20XX\nYou and your friends Jack,Kim and Ryan are having a picnic\nAs the day come to close, they start telling horror stories\nSuddenly Kim said you know i heard this horror story that is said to be cursed.");
        ui.ChoiceButton1.setText("Continue");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "prologue3";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
    public void Prologue3(){
        
        ui.StoryText.setText("ooh tell us about it lol said Jack while joking around\nI don't know about it though said Kim\njeez don't worry about it dude we're not a scaredy cat just tell us said Ryan\nwell okay then said Kim");
        ui.ChoiceButton1.setText("Continue");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "prologue4";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void Prologue4(){
        
        ui.StoryText.setText("I heard this from my senior... He said he dreamt waking up in an abadoned school with a note in his hand that said find her eye before she found you\nSo he searched around the school and found the eye and suddenly this weird girl ask where's my eye?");
        ui.ChoiceButton1.setText("Continue");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "prologue5";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
       public void Prologue5(){
        
        ui.StoryText.setText("so he give it to her and all she said ohh and left. and suddenly he woke up... so i said it was curse right it because when you are told by someone about this you will have the same dream.. and i got the dream too the day my senior tell me about it said Kim");
        ui.ChoiceButton1.setText("Continue");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "prologue6";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    } 
       public void Prologue6(){
        
        ui.StoryText.setText("Dude that's not even scary at all said Jack\nLol nice try Kim, let's just rest we have a long day waiting for us tommorow said Ryan\nSo all of you decided to rest");
        ui.ChoiceButton1.setText("Rest");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "classroom";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    } 
       public void Classroom(){
        ui.SceneImage = new ImageIcon(".//res//SClassroom.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
                
        ui.StoryText.setText("As you woke up you found youself in a classroom of an abandoned school with a note in your left hand that said find her eye before she find you\nWhat would you do?");
        ui.ChoiceButton1.setText("Search around the class");
        ui.ChoiceButton2.setText("Go to the hallway");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "searchClass";
        main.nextPosition2 = "hallway";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    } 
       public void SearchClass(){
        
        ui.StoryText.setText("So you searched around the classroom but you found nothing\nWhat would you do?");
        ui.ChoiceButton1.setText("Go to the hallway");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "hallway";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    } 
       public void Hallway(){
        ui.SceneImage = new ImageIcon(".//res//Floor.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("You left the classroom and found yourself in a hallway\nWhat would you do?");
        ui.ChoiceButton1.setText("Go down a stair");
        ui.ChoiceButton2.setText("Go up the stair");
        ui.ChoiceButton3.setText("Search around the hallway");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "firstFloor";
        main.nextPosition2 = "thirdFloor";
        main.nextPosition3 = "secondFloor";
        main.nextPosition4 = "";  
    } 
       public void FirstFloor(){
        ui.SceneImage = new ImageIcon(".//res//Floor.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("You arrive in first floor and you found a teacher room\nWhat would you do?");
        ui.ChoiceButton1.setText("Go into the Teacher room");
        ui.ChoiceButton2.setText("Go back to the second floor");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "teacherRoom";
        main.nextPosition2 = "secondFloor";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    } 
       public void TeacherRoom(){
        ui.SceneImage = new ImageIcon(".//res//Troom.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("When you went into the room suddenly the phone rang");
        ui.ChoiceButton1.setText("Pick it up");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "pickPhone";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    } 
       public void PickPhone(){
        
        ui.StoryText.setText("As you answer the phone\nA voice of a girl said i'm here to get my eye back\nAfter the call ended you heard sound of someone opening the door");
        ui.ChoiceButton1.setText("Hide under the table");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "hideTable";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
       public void HideTable(){
        ui.SceneImage = new ImageIcon(".//res//TRScary1.png");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("As soon as you heard the sound of the door opening you went under the table\nYou hear this footstep coming close. As the sound comes to end you see this foot in front of you");
        ui.ChoiceButton1.setText("Stay quiet");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "stayQuiet";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
       public void StayQuiet(){
        ui.SceneImage = new ImageIcon(".//res//TRScary2.png");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        
        ui.GImageLabel.setIcon(ui.SceneImage);
        ui.StoryText.setText("You cower and tried to stay quiet... time passes by no more sound can be heard\nYou sigh out of relieve and then try to look once again\nAnd what you see is juat a destroyed face of a woman\nShe lunge at you while shouting Give me my eye!!!");
        ui.ChoiceButton1.setText("woke up");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "badEnding";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
       public void BadEnding(){
        ui.SceneImage = new ImageIcon(".//res//birdsbegone.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("You woke up from the terror you experience but something is a miss\nSuddenly your friend shout where the hell is your left eye!!");
        ui.ChoiceButton1.setText("Continue");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "epilogue";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
       public void Epilogue(){
        ui.SceneImage = new ImageIcon(".//res//ScaryBook.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("Whether this story real or not it's still a fragment of reality\nSo remember be careful of what story you tell or heard of...\nAnd don't forget to find the eye");
        ui.ChoiceButton1.setText("Return to Title Screen");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "titleScreen";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void TitleScreen(){
        
        sm.TitleScreen();
    }
        public void SecondFloor(){
        ui.SceneImage = new ImageIcon(".//res//Floor.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("Suddenly you heard a noise from a locker nearby\nWhat would you do?");
        ui.ChoiceButton1.setText("Go to the locker");
        ui.ChoiceButton2.setText("Go to the first floor");
        ui.ChoiceButton3.setText("Go to the third floor");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "locker";
        main.nextPosition2 = "firstFloor";
        main.nextPosition3 = "thirdFloor";
        main.nextPosition4 = "";  
    }
        public void Locker(){
        ui.SceneImage = new ImageIcon(".//res//LockerDesu.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("As you get near the locker the noises keep getting larger and larger");
        ui.ChoiceButton1.setText("Open the locker");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "openLocker";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void OpenLocker(){
        ui.SceneImage = new ImageIcon(".//res//LScary.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("When you raise your hand to open the locker...\nSuddenly the locker open itself and a woman lunge into you\nShouting my eye!!!");
        ui.ChoiceButton1.setText("Wake up");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "badEnding";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void ThirdFloor(){
        ui.SceneImage = new ImageIcon(".//res//Floor.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("As you arrive in the third floor you're drawn into a place\nYou found yourself in front of the girl's toilet\nWhat would you do?");
        ui.ChoiceButton1.setText("Go into the girl's toilet");
        ui.ChoiceButton2.setText("Go to the second floor");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "girlToilet";
        main.nextPosition2 = "secondFloor";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void GirlToilet(){
        ui.SceneImage = new ImageIcon(".//res//GTBeLike.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("After you go into the girl's toilet you see something near the mirror\nYou get closer and realize it's an eye\nWhat would you do?");
        ui.ChoiceButton1.setText("Take the eye");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "getEye";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void GetEye(){
        ui.SceneImage = new ImageIcon(".//res//GTScary1.png");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("When you pick up the eye suddenly you see in the mirror there is a woman standing behind you\nAnd then you hear My eye... Give me my eye... where's my eye?");
        ui.ChoiceButton1.setText("Return the eye");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "giveEye";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void GiveEye(){
        ui.SceneImage = new ImageIcon(".//res//GTScary2.png");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("Eventhough you are scared you return the eye to the woman\nThe woman then said ooh and left");
        ui.ChoiceButton1.setText("Wake up");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "goodEnding";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
        public void GoodEnding(){
        ui.SceneImage = new ImageIcon(".//res//birdsbegone.jpg");
        Image SImage = ui.SceneImage.getImage();
        Image ModifiedSImage = SImage.getScaledInstance(ui.WSI,ui.HSI, java.awt.Image.SCALE_SMOOTH);
        ui.SceneImage = new ImageIcon(ModifiedSImage);
        ui.GImageLabel.setIcon(ui.SceneImage);
        
        ui.StoryText.setText("You woke up... while sweating like crazy\nAnd then you heard a shout Jack where's your left eye!!!");
        ui.ChoiceButton1.setText("Continue");
        ui.ChoiceButton2.setText("");
        ui.ChoiceButton3.setText("");
        ui.ChoiceButton4.setText("");
        
        main.nextPosition1 = "epilogue";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";  
    }
}
