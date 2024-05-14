import java.util.ArrayList;

class Tavalier extends Piece{
    
    public Tavalier(){
	super('B', new Position());
    }

    public Tavalier(char couleur, Position position){
	super(couleur, position);
    }


    public String getType(){
    	return new String("tavalier");
    }
    

    public ArrayList<Position> getDeplacementPossible(Plateau pl)
    {
	// Une dame a les coups possibles de la tour et du fou combinés
	ArrayList<Position> retour = new ArrayList<Position>();
	
	Tour t = new Tour(this.getCouleur(), this.getPosition());
	Cavalier c = new Cavalier(this.getCouleur(), this.getPosition());

	
	ArrayList<Position> deplacementPossible = t.getDeplacementPossible(pl);
	for(Position p : deplacementPossible)
	    retour.add(p);

	deplacementPossible = c.getDeplacementPossible(pl);
	for(Position p : deplacementPossible)
	    retour.add(p);

	return retour;
    }

    
}
