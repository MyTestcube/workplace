public abstract class Gj19Officer {

        protected String name;
        protected Gj19Officer gj19successor;


        public Gj19Officer(String name)
        {
            this.name=name;
        }
        public void setgj19Successor(Gj19Officer gj19successor)
        {
            this.gj19successor=gj19successor;
        }
        public abstract void handleMission(Gj19Mission mission);

}
