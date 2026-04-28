package secondPhase.RPG;


    public class Potion extends Items {

        private int healAmount;

        public Potion(String name, int healAmount) {
            super(name, 0, 150, true); // oneTimeUse = true
            this.healAmount = healAmount;
        }

        @Override
        public void use(Player player) {
            player.heal(healAmount);
            System.out.println("Vyliečil si sa o " + healAmount + " HP");
        }




    }

