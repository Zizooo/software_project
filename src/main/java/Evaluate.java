package main.java;

import java.util.ArrayList;

public class Evaluate {
	ArrayList<String> contents;
    String item;
    public boolean Check(String oldstr,String addstr){
    	boolean res=false;
    	if(Character.isDigit(addstr.charAt(0))){
    		if(oldstr.length()==0){
    			res=true;
    		}
    		else{
    		char ch=oldstr.charAt(oldstr.length()-1);
    		if(Character.isDigit(ch) || ch=='.' || ch=='('||ch=='*'||ch=='-'||ch=='+'||ch=='/'||ch=='%'||ch=='^'){
    			res=true;
    		}
    		}
    	}
    	else if(addstr.charAt(0)=='.'){
    		if(oldstr.length()==0){
    			res=true;
    		}
    		else{
    		char ch=oldstr.charAt(oldstr.length()-1);
    		if(Character.isDigit(ch) || ch=='.' || ch=='('||ch=='*'||ch=='-'||ch=='+'||ch=='/'||ch=='%'||ch=='^'){
    			res=true;
    		}
    		}
    	}
    	else if(addstr.charAt(0)=='+'||addstr.charAt(0)=='-'||addstr.charAt(0)==')'||addstr.charAt(0)=='*'||addstr.charAt(0)=='/'||addstr.charAt(0)=='%'||addstr.charAt(0)=='^'){
    		if(oldstr.length()==0){
    			
    		}
    		else{
    		char ch=oldstr.charAt(oldstr.length()-1);
    		if(Character.isDigit(ch) ||ch==')'){
    			res=true;
    		}
    		}
    	}
    	else if(addstr.charAt(0)=='S'||addstr.charAt(0)=='('){
    		if(oldstr.length()==0){
    			res=true;
    		}
    		else{
    		char ch=oldstr.charAt(oldstr.length()-1);
    		if(ch=='('||ch=='*'||ch=='-'||ch=='+'||ch=='/'||ch=='%'||ch=='^'){
    			res=true;
    		}
    		}
    	}
    	else if(addstr.charAt(0)=='='){
    		if(oldstr.length()==0){
    			
    		}
    		else{
    		char ch=oldstr.charAt(oldstr.length()-1);
    		if(ch==')' || Character.isDigit(ch)){
    			res=true;
    		}
    		}
    	}
    	return res;
    }
    public String bracketsremove(String s) throws Exception{
        while (s.contains(Character.toString('(')) || s.contains(Character.toString(')'))) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ')') {
                    for (int j = i; j >= 0; j--) {
                        if (s.charAt(j) == '(') {
                            String in = s.substring(j + 1, i);
                            in =solve(in);
                            s = s.substring(0, j) + in + s.substring(i + 1);
                            j = i = 0;
                        }
                    }
                }
            }
        }
        s = solve(s);
        return s;
    }

    public String solve(String s) throws Exception{
        contents = new ArrayList<String>();
        item = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                item = s.charAt(i) + item;
                if (i == 0) {
                    put();
            }
            }
            else {
                if (s.charAt(i) == '.') {
                    item = s.charAt(i) + item;
                }
                else {
                    put();
                    item += s.charAt(i);
                    put();
                }
            }
        }
        try {
			contents = result(contents);
		} catch (Exception e) {
			throw new Exception();
		}
        return contents.get(0);
    }
    
    public void put(){
        if (!item.equals("")) {
            contents.add(0, item);
            item = "";
        }
    }

    public ArrayList<String> result(ArrayList<String> arraylist) throws Exception{
        double result =0;
        for (int c = 0; c < arraylist.size(); c++) {
            if (arraylist.get(c).equals("*") || arraylist.get(c).equals("/")||arraylist.get(c).equals("+")||arraylist.get(c).equals("-")||arraylist.get(c).equals("%")) {
                if (arraylist.get(c).equals("*")) {
                	try{
                	result=Double.parseDouble(arraylist.get(c - 1)) * Double.parseDouble(arraylist.get(c + 1));
                	}
                	catch(Exception ex){
                		throw new Exception();
                	}
                } 
                else if (arraylist.get(c).equals("/")) {
                	try{
                    	result=Double.parseDouble(arraylist.get(c - 1)) / Double.parseDouble(arraylist.get(c + 1));
                    	}
                    	catch(Exception ex){
                    		throw new Exception();
                    	}
                }
                else if (arraylist.get(c).equals("+")) {
                	try{
                    	result=Double.parseDouble(arraylist.get(c - 1)) + Double.parseDouble(arraylist.get(c + 1));
                    	}
                    	catch(Exception ex){
                    		throw new Exception();
                    	}
                } 
                else if (arraylist.get(c).equals("-")) {
                	try{
                    	result=Double.parseDouble(arraylist.get(c - 1)) - Double.parseDouble(arraylist.get(c + 1));
                    	}
                    	catch(Exception ex){
                    		throw new Exception();
                    	}
                } 
                else if (arraylist.get(c).equals("%")) {
                	try{
                    	result=Double.parseDouble(arraylist.get(c - 1)) % Double.parseDouble(arraylist.get(c + 1));
                    	}
                    	catch(Exception ex){
                    		throw new Exception();
                    	}
                }
                try {
                	arraylist.set(c, new Double(result).toString());
                	arraylist.remove(c + 1);
                	arraylist.remove(c - 1);
                } 
                catch (Exception ignored) {
                	
                }
            } 
            else {
                continue;
            }
            c = 0;
        }
        return arraylist;
    }
    
}
