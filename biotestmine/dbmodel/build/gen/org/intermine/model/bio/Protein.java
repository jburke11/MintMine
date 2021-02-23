package org.intermine.model.bio;

public interface Protein extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getMd5checksum();
    public void setMd5checksum(final java.lang.String md5checksum);

    public java.lang.String getPrimaryAccession();
    public void setPrimaryAccession(final java.lang.String primaryAccession);

    public java.lang.Double getMolecularWeight();
    public void setMolecularWeight(final java.lang.Double molecularWeight);

    public java.lang.Integer getLength();
    public void setLength(final java.lang.Integer length);

    public java.lang.Boolean getIsFragment();
    public void setIsFragment(final java.lang.Boolean isFragment);

    public java.lang.String getUniprotAccession();
    public void setUniprotAccession(final java.lang.String uniprotAccession);

    public java.lang.Boolean getIsUniprotCanonical();
    public void setIsUniprotCanonical(final java.lang.Boolean isUniprotCanonical);

    public java.lang.String getUniprotName();
    public void setUniprotName(final java.lang.String uniprotName);

    public org.intermine.model.bio.Protein getCanonicalProtein();
    public void setCanonicalProtein(final org.intermine.model.bio.Protein canonicalProtein);
    public void proxyCanonicalProtein(final org.intermine.objectstore.proxy.ProxyReference canonicalProtein);
    public org.intermine.model.InterMineObject proxGetCanonicalProtein();

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.Comment> getComments();
    public void setComments(final java.util.Set<org.intermine.model.bio.Comment> comments);
    public void addComments(final org.intermine.model.bio.Comment arg);

    public java.util.Set<org.intermine.model.bio.ECNumber> getEcNumbers();
    public void setEcNumbers(final java.util.Set<org.intermine.model.bio.ECNumber> ecNumbers);
    public void addEcNumbers(final org.intermine.model.bio.ECNumber arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Protein> getIsoforms();
    public void setIsoforms(final java.util.Set<org.intermine.model.bio.Protein> isoforms);
    public void addIsoforms(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.OntologyTerm> getKeywords();
    public void setKeywords(final java.util.Set<org.intermine.model.bio.OntologyTerm> keywords);
    public void addKeywords(final org.intermine.model.bio.OntologyTerm arg);

    public java.util.Set<org.intermine.model.bio.Component> getComponents();
    public void setComponents(final java.util.Set<org.intermine.model.bio.Component> components);
    public void addComponents(final org.intermine.model.bio.Component arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

    public java.util.Set<org.intermine.model.bio.UniProtFeature> getFeatures();
    public void setFeatures(final java.util.Set<org.intermine.model.bio.UniProtFeature> features);
    public void addFeatures(final org.intermine.model.bio.UniProtFeature arg);

}
