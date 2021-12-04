//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Herbs {
//        public ArrayList<Object> herbsList;
//        private ArrayList<Object> qualities; //every herb has qualities
//        private ArrayList<Object> actions; //every herb has actions
//        private ArrayList<Object> herbQuality;
//        private ArrayList<Object> herbAction;
//        private HashMap<Object, Object> herbQualities;
//        private HashMap<Object, Object> herbActions;
//
//        public Herbs() {
//            this.herbsList = new ArrayList<>();
//
//            this.herbQuality = new ArrayList<>();
//            this.herbAction = new ArrayList<>();
//            this.herbQualities = new HashMap<>();
//            this.herbActions = new HashMap<>();
//
//
//            //list of qualities
//            this.qualities = new ArrayList<>();
//            qualities.add("Hot");
//            qualities.add("Cold");
//            qualities.add("Dry");
//            qualities.add("Moist");
//
//            //list of actions
//            this.actions = new ArrayList<>();
//            actions.add("Adaptogen");
//            actions.add("Astringent");
//            actions.add("Bitter");
//            actions.add("Cardiac Remedy");
//            actions.add("Cholagogue");
//            actions.add("Demulcent");
//            actions.add("Diuretic");
//            actions.add("Emmenagogue");
//            actions.add("Expectorant");
//            actions.add("Hepatic");
//        }
//    public void setHerbs() {
//        //quality list for herbs
//        herbQuality.add(new Garlic().qualities());
//
//        //actions list for herbs
//        herbAction.add(new Garlic().actions());
//
//        //use hashmap to reference list
//        herbQualities.put("qualities", herbQuality.get(0)); // should return Garlic, where it will contain actions and qualities
//        herbActions.put("actions", herbAction.get(0)); // should return Garlic, where it will contain actions and qualities
//    }
//
//    public void getHerbs() {
//
//    }
//
//    public void setQualities() {
//    Object herb = new Object();
//    herbsList.add(object);
//    }
//
//    public String qualities() {
//        return "The herb qualities are:\n "
//                + qualities.get(0) + ", "
//                + qualities.get(1) + ", "
//                + qualities.get(2) + " and "
//                + qualities.get(3) + ".";
//    }
//
//    public String actions() {
//        return "The herb actions are:\n "
//                + actions.get(0) + " and "
//                + actions.get(1) + " and "
//                + actions.get(2) + " and "
//                + actions.get(3) + " and "
//                + actions.get(4) + " and "
//                + actions.get(5) + " and "
//                + actions.get(6) + " and "
//                + actions.get(7) + " and "
//                + actions.get(8) + " and "
//                + actions.get(9) + ".";
//    }
//}
