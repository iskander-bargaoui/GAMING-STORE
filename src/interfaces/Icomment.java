/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import models.Comment;
import models.Post;


/**
 *
 * @author msi
 */
public interface Icomment {
       //ajouter
    public boolean ajouterComment(Comment c);
    //lister
    public List<Comment> afficherComment();
    //update
      public boolean modifierComment(Comment c);
  //delete
          public boolean supprimerComment(Comment c);
}
     