package com.lerson.dslist.projections;

public interface GameMinProjection {

    // Cada método get deve corresponder a cada dado buscado na consulta
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
