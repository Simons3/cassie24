class Main {  
  public static void main( String args[ ] ) { 
       Avatar cassie = new Avatar( "sea", "trident" ); 
       cassie.fightBoss( );
  } 
  public static class Avatar { 
       String type, weapon;
       public Avatar( String startType, String startWeapon ) {
                   type = startType;
                   weapon = startWeapon; 
       }
      public void fightBoss() {
                   System.out.println( " You fight the boss in the " + type + ".");
                   if( type.equals( "air") ){ 
                      System.out.println( " You fly to victory. " );
                   } else {
                      System.out.println( " You swim to victory. " );
                   } 
      } } }
