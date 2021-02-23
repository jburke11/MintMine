package org.intermine.model.bio;

public interface Comment extends org.intermine.model.InterMineObject
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}
