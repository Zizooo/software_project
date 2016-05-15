package main.java;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class calculator extends Application {
    private TextField t = new TextField();
    private boolean result=false;
    @Override
	public void start(Stage primaryStage) {
		Rectangle2D platform=Screen.getPrimary().getVisualBounds();
		double w=platform.getWidth();
		double h=platform.getHeight();
		t.setLayoutX((w*0.02));
		t.setLayoutY((h*0.02));
		t.setAlignment(Pos.CENTER_RIGHT);  
		t.setEditable(false);
		t.setStyle("-fx-background-color:white");
		t.setMinSize(w-(w*0.040),(h*0.16));
		t.setMaxSize(w-(w*0.040),(h*0.16));
		t.setFont(new Font((h*0.2)*0.35));
		Rectangle r=new Rectangle(w,h);
		r.setFill(Color.LIGHTBLUE);
		Pane p=new Pane ();
		Button[][] b=new Button[4][6] ;
		p.getChildren().addAll(r,t);
		for(int i =0;i<4;i++ )
		{
			for(int j = 0; j <6;j++)
			{
				b[i][j]=new Button();
				b[i][j].setLayoutX(j*(w/6)+w*0.02);
				b[i][j].setLayoutY((i+1)*(h*0.2));
				b[i][j].setMaxSize((w/6)-(w*0.01), (h/4)-(h*0.03));
				b[i][j].setMinSize((w/6)-(w*0.01), (h/4)-(h*0.07));
				b[i][j].setFont(new Font((w/6)*0.2));
				p.getChildren().add(b[i][j]);
			}
			
		}
		
///////////////////////////////////////////////////////////////  set text //////////////////
		
b[0][0].setText("7"); b[0][1].setText("8"); b[0][2].setText("9"); b[0][3].setText("/"); b[0][4].setText("del"); b[0][5].setText("clear");

b[1][0].setText("4"); b[1][1].setText("5"); b[1][2].setText("6"); b[1][3].setText("*"); b[1][4].setText("("); b[1][5].setText(")");

b[2][0].setText("1"); b[2][1].setText("2"); b[2][2].setText("3"); b[2][3].setText("-"); b[2][4].setText("x^2"); b[2][5].setText("Sqr");


b[3][0].setText("0"); b[3][1].setText("."); b[3][2].setText("%"); b[3][3].setText("+"); b[3][4].setText("="); b[3][5].setText("x^n");

		
		/////////////////////////////////////////////////////  event driven
b[0][0].setOnAction(new EventHandler<ActionEvent>() {      ////////////// 7 
    @Override
    public void handle(ActionEvent event) {
    	String digit =b[0][0].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});

b[0][1].setOnAction(new EventHandler<ActionEvent>() {     // 8
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[0][1].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[0][2].setOnAction(new EventHandler<ActionEvent>() {//9
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[0][2].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);        }
    }
});
b[1][0].setOnAction(new EventHandler<ActionEvent>() {   ///////////  4
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[1][0].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});

b[1][1].setOnAction(new EventHandler<ActionEvent>() {   //////////////  5
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[1][1].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[1][4].setOnAction(new EventHandler<ActionEvent>() {   //////////////  (
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[1][4].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[1][5].setOnAction(new EventHandler<ActionEvent>() {   //////////////  )
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[1][5].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[1][2].setOnAction(new EventHandler<ActionEvent>() {   //////////////  6
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[1][2].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[2][0].setOnAction(new EventHandler<ActionEvent>() {    ////////// 1
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[2][0].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[2][1].setOnAction(new EventHandler<ActionEvent>() {  ////////////2
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[2][1].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[2][2].setOnAction(new EventHandler<ActionEvent>() {  //////////// 3
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[2][2].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[3][0].setOnAction(new EventHandler<ActionEvent>() {  /////////// 000000
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[3][0].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});
b[3][1].setOnAction(new EventHandler<ActionEvent>() {    ////////// ...//////////////
    @Override
    public void handle(ActionEvent event) {
    	String digit = b[3][1].getText();
    	if(result){
    		t.clear();
    		t.setText(digit);
    		result=false;
    	}
    	else{
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }
    }
});

b[0][3].setOnAction(new EventHandler<ActionEvent>() {    ////////// division...//////////////
    @Override
    public void handle(ActionEvent event) {
    	if(result){
    		result=false;
    	}
    	String digit = b[0][3].getText();
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
    }
});

b[1][3].setOnAction(new EventHandler<ActionEvent>() {   ////////// multiplying...//////////////
    @Override
    public void handle(ActionEvent event) {
    	if(result){
    		result=false;
    	}
    	String digit = b[1][3].getText();
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
    }
});

b[2][3].setOnAction(new EventHandler<ActionEvent>() {  ////////// sub...//////////////
    @Override
    public void handle(ActionEvent event){
    	if(result){
    		result=false;
    	}
    	String digit = b[2][3].getText();
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
    }
});
b[3][3].setOnAction(new EventHandler<ActionEvent>(){    ////////// .sum..//////////////
    @Override
    public void handle(ActionEvent event) {
    	if(result){
    		result=false;
    	}
    	String digit = b[3][3].getText();
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
    }
});
b[3][2].setOnAction(new EventHandler<ActionEvent>() {    ////////// remainder...//////////////
    @Override
    public void handle(ActionEvent event) {
    	if(result){
    		result=false;
    	}
    	String digit = b[3][2].getText();
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
    }
});
b[2][4].setOnAction(new EventHandler<ActionEvent>() {    //////////  power ...//////////////
    @Override
    public void handle(ActionEvent event) {
    	if(result){
    		result=false;
    	}
    	String digit = "^2";
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
    }
});
b[3][5].setOnAction(new EventHandler<ActionEvent>() {    //////////  power ...//////////////
    @Override
    public void handle(ActionEvent event) {
    	if(result){
    		result=false;
    	}
    	String digit = "^";
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
    }
});

b[2][5].setOnAction(new EventHandler<ActionEvent>() {    //////////  square root.//////////////
    @Override
    public void handle(ActionEvent event) {
    	if(result){
    		t.clear();
    		result=false;
    	}
    	else{
    	String digit = "Sqr(";
        String oldtext= t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(oldtext, digit))
        	t.setText(oldtext+digit);
        }

    }
});

b[3][4].setOnAction(new EventHandler<ActionEvent>() {    //////////  acess eqell sign//////////////
    @Override
    public void handle(ActionEvent event) {
        String res=t.getText();
        Evaluate eu=new Evaluate();
        if(eu.Check(res, "=")){
        try {
			res=Update(res);
		} catch (Exception e1) {
			t.setText("Invalid Expretion");
		}
        Evaluate ev = new Evaluate();
        try {
			res = ev.bracketsremove(res);
		} catch (Exception e) {
			t.setText("Invalid Expretion");
		}
        t.setText(res);
        result=true;
        }
        
    }
});

b[0][5].setOnAction(new EventHandler<ActionEvent>() {    //////////  clear date and reset  //////////////
    @Override
    public void handle(ActionEvent event) {
       t.clear();
    }
});

b[0][4].setOnAction(new EventHandler<ActionEvent>() {    //////////  clear date and reset  //////////////
    @Override
    public void handle(ActionEvent event) {
    	String s1=t.getText();
    	String s2=s1.substring(0,s1.length()-1);
    	t.setText(s2);
    }
});
/////////////////////////////////////////////////////////////////
		 Scene scene = new Scene(p,w,h);
	        primaryStage.setScene(scene);
	        primaryStage.show();
}
    public String Update(String state)throws Exception{
    	double value=0.0;
    	while(state.contains("Sqr")){
    		String inner="";
    		if(state.substring(state.indexOf("Sqr")).contains(")")){
    			inner=state.substring(state.indexOf("Sqr")+4,state.substring(state.indexOf("Sqr")).indexOf(")")+state.indexOf("Sqr"));
    		}
    		else{
    			state=state.concat(")");
    			inner=state.substring(state.indexOf("Sqr")+4,state.substring(state.indexOf("Sqr")).indexOf(")")+state.indexOf("Sqr"));
    		}
    		if(inner.contains("Sqr")){
    			inner=state.substring(state.indexOf("Sqr")+4,state.substring(state.indexOf("Sqr")).indexOf(")")+state.indexOf("Sqr")+1);
    		    inner=Update(inner);
    		    state=state.replace(state.substring(state.lastIndexOf("Sqr"),state.substring(state.lastIndexOf("Sqr")).indexOf(")")+state.lastIndexOf("Sqr")+1), inner);
    		    continue;
    		}
    		//System.out.println(inner);
    		Evaluate ev = new Evaluate();
            try {
				inner = ev.bracketsremove(inner);
			} catch (Exception e) {
				t.setText("Invalid Expretion");
				throw new Exception();
			}
    	    value=Double.parseDouble(inner);
    	    value=Math.sqrt(value);
    	    //System.out.println(state);
    	    state=state.replace(state.substring(state.lastIndexOf("Sqr"),state.substring(state.lastIndexOf("Sqr")).indexOf(")")+state.lastIndexOf("Sqr")+1), value+"");
    	   //System.out.println(state);
    	}
    	String priv="";
        String next="";
        String rpriv="";
        double p=0.0,n=0.0;
    	while(state.contains("^")){
    		int index=state.indexOf("^");
    		if(state.charAt(index+1)=='('){
    			next=state.substring(index+1,state.indexOf(")", index)+1);
    			Evaluate ev = new Evaluate();
    			try {
					next = ev.bracketsremove(next);
				} catch (Exception e) {
					t.setText("Invalid Expretion");
				}
    		    n=Double.parseDouble(next);
    		}
    		else{
    		for(int i=index+1;i<state.length();i++){
    			if(Character.isDigit(state.charAt(i)) || state.charAt(i)=='.'){
    				next=next.concat(Character.toString(state.charAt(i)));
    			}
    			else{
    				break;
    			}
    		}
    		n=Double.parseDouble(next);
    		}
    		if(state.charAt(index-1)==')'){
    			priv=state.substring(index);
    			priv=priv.substring(priv.lastIndexOf("("),index+1);
    			Evaluate ev = new Evaluate();
    			try {
					priv = ev.bracketsremove(priv);
				} catch (Exception e) {
					t.setText("Invalid Expretion");
				}
    		    p=Double.parseDouble(priv);
    			value=Math.pow(p, n);
    			state=state.replace(priv+"^"+next,""+value);
    		}
    		else{
    		for(int i=index-1;i>=0;i--){
    			if(Character.isDigit(state.charAt(i)) || state.charAt(i)=='.'){
    				priv=priv.concat(Character.toString(state.charAt(i)));
    			}
    			else{
    				break;
    			}
    		}
    		for(int i=priv.length()-1;i>=0;i--){
    			rpriv=rpriv.concat(Character.toString(priv.charAt(i)));
    		}
    		p=Double.parseDouble(rpriv);
    		}
    		value=Math.pow(p, n);
    		state=state.replace(rpriv+"^"+next,""+value);
    		next="";
    		priv="";
    		rpriv="";
    	}
    	return state;
    }
   public static void main(String[] args) {
		launch(args);
	}
}