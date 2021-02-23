package org.intermine.model.bio;

public interface UniProtFeature extends org.intermine.model.InterMineObject
{
    public java.lang.Integer getBegin();
    public void setBegin(final java.lang.Integer begin);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.Integer getEnd();
    public void setEnd(final java.lang.Integer end);

    public org.intermine.model.bio.OntologyTerm getFeature();
    public void setFeature(final org.intermine.model.bio.OntologyTerm feature);
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature);
    public org.intermine.model.InterMineObject proxGetFeature();

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

}
