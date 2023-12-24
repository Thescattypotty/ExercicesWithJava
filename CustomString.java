
public class CustomString {

    private String string;

    public CustomString(String string)
    {
        this.string = string;
    }

    public String geString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String remove(String args)
    {
        String newString = "";
        for(char c : this.string.toCharArray())
        {
            if(!exist(c,args) || !Character.isLetter(c))
            {
                newString += c;
            }
        }
        return newString;
    }


    public String reverse(String args)
    {
        String newString = "";
        for(char c: this.string.toCharArray())
        {
            if(isHere(c, args) && Character.isLetter(c)){
                if(Character.isUpperCase(c))
                {
                    newString += Character.toLowerCase(c);
                }
                else if(Character.isLowerCase(c))
                {
                    newString += Character.toUpperCase(c);
                }
            }
            else
            {
                newString += c;
            }
            
        }
        return newString;
    }


    public String filterLetters(char n , boolean more)
    {
        String args = "";

        for(char e : string.toCharArray())
        {
            if(more == true)
            {
                if(n >= e)
                    args+= e;
            }
            else
            {
                if(n <= e)
                    args+=e;
            }
        }
        return remove(args);
    }



    public boolean exist(char c , String args)
    {
        for(char caractere : args.toCharArray())
        {
            if(caractere == c)
            {
                return true;
            }
        }

        return false;
    }
    public boolean isHere(char c , String args)
    {
        for(char caractere : args.toCharArray())
        {
            if(Character.toLowerCase(caractere) == Character.toLowerCase(c))
            {
                return true;
            }
        }

        return false;
    }
    public void display()
    {
        System.out.println(this.string);
    }

    public static void main(String[] args)
    {
        CustomString cs = new CustomString("abc,XYZ;123");
        cs.display();
        System.out.println("cs reverse === "+cs.reverse("bcdxyz@3210."));
        System.out.println("cs remove === "+cs.remove("A;v123skY,."));
        System.out.println("cs filter === "+cs.filterLetters('y' , true));
    }

}
