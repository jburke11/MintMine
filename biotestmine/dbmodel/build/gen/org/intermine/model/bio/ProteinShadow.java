package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class ProteinShadow implements Protein, ShadowClass
{
    public static final Class<Protein> shadowOf = Protein.class;
    // Attr: org.intermine.model.bio.Protein.md5checksum
    protected java.lang.String md5checksum;
    public java.lang.String getMd5checksum() { return md5checksum; }
    public void setMd5checksum(final java.lang.String md5checksum) { this.md5checksum = md5checksum; }

    // Attr: org.intermine.model.bio.Protein.primaryAccession
    protected java.lang.String primaryAccession;
    public java.lang.String getPrimaryAccession() { return primaryAccession; }
    public void setPrimaryAccession(final java.lang.String primaryAccession) { this.primaryAccession = primaryAccession; }

    // Attr: org.intermine.model.bio.Protein.molecularWeight
    protected java.lang.Double molecularWeight;
    public java.lang.Double getMolecularWeight() { return molecularWeight; }
    public void setMolecularWeight(final java.lang.Double molecularWeight) { this.molecularWeight = molecularWeight; }

    // Attr: org.intermine.model.bio.Protein.length
    protected java.lang.Integer length;
    public java.lang.Integer getLength() { return length; }
    public void setLength(final java.lang.Integer length) { this.length = length; }

    // Attr: org.intermine.model.bio.Protein.isFragment
    protected java.lang.Boolean isFragment;
    public java.lang.Boolean getIsFragment() { return isFragment; }
    public void setIsFragment(final java.lang.Boolean isFragment) { this.isFragment = isFragment; }

    // Attr: org.intermine.model.bio.Protein.uniprotAccession
    protected java.lang.String uniprotAccession;
    public java.lang.String getUniprotAccession() { return uniprotAccession; }
    public void setUniprotAccession(final java.lang.String uniprotAccession) { this.uniprotAccession = uniprotAccession; }

    // Attr: org.intermine.model.bio.Protein.isUniprotCanonical
    protected java.lang.Boolean isUniprotCanonical;
    public java.lang.Boolean getIsUniprotCanonical() { return isUniprotCanonical; }
    public void setIsUniprotCanonical(final java.lang.Boolean isUniprotCanonical) { this.isUniprotCanonical = isUniprotCanonical; }

    // Attr: org.intermine.model.bio.Protein.uniprotName
    protected java.lang.String uniprotName;
    public java.lang.String getUniprotName() { return uniprotName; }
    public void setUniprotName(final java.lang.String uniprotName) { this.uniprotName = uniprotName; }

    // Ref: org.intermine.model.bio.Protein.canonicalProtein
    protected org.intermine.model.InterMineObject canonicalProtein;
    public org.intermine.model.bio.Protein getCanonicalProtein() { if (canonicalProtein instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Protein) ((org.intermine.objectstore.proxy.ProxyReference) canonicalProtein).getObject()); }; return (org.intermine.model.bio.Protein) canonicalProtein; }
    public void setCanonicalProtein(final org.intermine.model.bio.Protein canonicalProtein) { this.canonicalProtein = canonicalProtein; }
    public void proxyCanonicalProtein(final org.intermine.objectstore.proxy.ProxyReference canonicalProtein) { this.canonicalProtein = canonicalProtein; }
    public org.intermine.model.InterMineObject proxGetCanonicalProtein() { return canonicalProtein; }

    // Ref: org.intermine.model.bio.Protein.sequence
    protected org.intermine.model.InterMineObject sequence;
    public org.intermine.model.bio.Sequence getSequence() { if (sequence instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Sequence) ((org.intermine.objectstore.proxy.ProxyReference) sequence).getObject()); }; return (org.intermine.model.bio.Sequence) sequence; }
    public void setSequence(final org.intermine.model.bio.Sequence sequence) { this.sequence = sequence; }
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence) { this.sequence = sequence; }
    public org.intermine.model.InterMineObject proxGetSequence() { return sequence; }

    // Col: org.intermine.model.bio.Protein.CDSs
    protected java.util.Set<org.intermine.model.bio.CDS> CDSs = new java.util.HashSet<org.intermine.model.bio.CDS>();
    public java.util.Set<org.intermine.model.bio.CDS> getcDSs() { return CDSs; }
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs) { this.CDSs = CDSs; }
    public void addcDSs(final org.intermine.model.bio.CDS arg) { CDSs.add(arg); }

    // Col: org.intermine.model.bio.Protein.comments
    protected java.util.Set<org.intermine.model.bio.Comment> comments = new java.util.HashSet<org.intermine.model.bio.Comment>();
    public java.util.Set<org.intermine.model.bio.Comment> getComments() { return comments; }
    public void setComments(final java.util.Set<org.intermine.model.bio.Comment> comments) { this.comments = comments; }
    public void addComments(final org.intermine.model.bio.Comment arg) { comments.add(arg); }

    // Col: org.intermine.model.bio.Protein.ecNumbers
    protected java.util.Set<org.intermine.model.bio.ECNumber> ecNumbers = new java.util.HashSet<org.intermine.model.bio.ECNumber>();
    public java.util.Set<org.intermine.model.bio.ECNumber> getEcNumbers() { return ecNumbers; }
    public void setEcNumbers(final java.util.Set<org.intermine.model.bio.ECNumber> ecNumbers) { this.ecNumbers = ecNumbers; }
    public void addEcNumbers(final org.intermine.model.bio.ECNumber arg) { ecNumbers.add(arg); }

    // Col: org.intermine.model.bio.Protein.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Col: org.intermine.model.bio.Protein.isoforms
    protected java.util.Set<org.intermine.model.bio.Protein> isoforms = new java.util.HashSet<org.intermine.model.bio.Protein>();
    public java.util.Set<org.intermine.model.bio.Protein> getIsoforms() { return isoforms; }
    public void setIsoforms(final java.util.Set<org.intermine.model.bio.Protein> isoforms) { this.isoforms = isoforms; }
    public void addIsoforms(final org.intermine.model.bio.Protein arg) { isoforms.add(arg); }

    // Col: org.intermine.model.bio.Protein.keywords
    protected java.util.Set<org.intermine.model.bio.OntologyTerm> keywords = new java.util.HashSet<org.intermine.model.bio.OntologyTerm>();
    public java.util.Set<org.intermine.model.bio.OntologyTerm> getKeywords() { return keywords; }
    public void setKeywords(final java.util.Set<org.intermine.model.bio.OntologyTerm> keywords) { this.keywords = keywords; }
    public void addKeywords(final org.intermine.model.bio.OntologyTerm arg) { keywords.add(arg); }

    // Col: org.intermine.model.bio.Protein.components
    protected java.util.Set<org.intermine.model.bio.Component> components = new java.util.HashSet<org.intermine.model.bio.Component>();
    public java.util.Set<org.intermine.model.bio.Component> getComponents() { return components; }
    public void setComponents(final java.util.Set<org.intermine.model.bio.Component> components) { this.components = components; }
    public void addComponents(final org.intermine.model.bio.Component arg) { components.add(arg); }

    // Col: org.intermine.model.bio.Protein.transcripts
    protected java.util.Set<org.intermine.model.bio.Transcript> transcripts = new java.util.HashSet<org.intermine.model.bio.Transcript>();
    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts() { return transcripts; }
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts) { this.transcripts = transcripts; }
    public void addTranscripts(final org.intermine.model.bio.Transcript arg) { transcripts.add(arg); }

    // Col: org.intermine.model.bio.Protein.features
    protected java.util.Set<org.intermine.model.bio.UniProtFeature> features = new java.util.HashSet<org.intermine.model.bio.UniProtFeature>();
    public java.util.Set<org.intermine.model.bio.UniProtFeature> getFeatures() { return features; }
    public void setFeatures(final java.util.Set<org.intermine.model.bio.UniProtFeature> features) { this.features = features; }
    public void addFeatures(final org.intermine.model.bio.UniProtFeature arg) { features.add(arg); }

    // Attr: org.intermine.model.bio.BioEntity.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.BioEntity.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.BioEntity.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Ref: org.intermine.model.bio.BioEntity.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.BioEntity.locatedFeatures
    protected java.util.Set<org.intermine.model.bio.Location> locatedFeatures = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocatedFeatures() { return locatedFeatures; }
    public void setLocatedFeatures(final java.util.Set<org.intermine.model.bio.Location> locatedFeatures) { this.locatedFeatures = locatedFeatures; }
    public void addLocatedFeatures(final org.intermine.model.bio.Location arg) { locatedFeatures.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.locations
    protected java.util.Set<org.intermine.model.bio.Location> locations = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocations() { return locations; }
    public void setLocations(final java.util.Set<org.intermine.model.bio.Location> locations) { this.locations = locations; }
    public void addLocations(final org.intermine.model.bio.Location arg) { locations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.synonyms
    protected java.util.Set<org.intermine.model.bio.Synonym> synonyms = new java.util.HashSet<org.intermine.model.bio.Synonym>();
    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.Synonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.crossReferences
    protected java.util.Set<org.intermine.model.bio.CrossReference> crossReferences = new java.util.HashSet<org.intermine.model.bio.CrossReference>();
    public java.util.Set<org.intermine.model.bio.CrossReference> getCrossReferences() { return crossReferences; }
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.CrossReference> crossReferences) { this.crossReferences = crossReferences; }
    public void addCrossReferences(final org.intermine.model.bio.CrossReference arg) { crossReferences.add(arg); }

    // Attr: org.intermine.model.bio.Annotatable.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Col: org.intermine.model.bio.Annotatable.ontologyAnnotations
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations = new java.util.HashSet<org.intermine.model.bio.OntologyAnnotation>();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations() { return ontologyAnnotations; }
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations) { this.ontologyAnnotations = ontologyAnnotations; }
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg) { ontologyAnnotations.add(arg); }

    // Col: org.intermine.model.bio.Annotatable.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Protein && id != null) ? id.equals(((Protein)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Protein [canonicalProtein=" + (canonicalProtein == null ? "null" : (canonicalProtein.getId() == null ? "no id" : canonicalProtein.getId().toString())) + ", id=" + id + ", isFragment=" + (isFragment == null ? "null" : "\"" + isFragment + "\"") + ", isUniprotCanonical=" + (isUniprotCanonical == null ? "null" : "\"" + isUniprotCanonical + "\"") + ", length=" + length + ", md5checksum=" + (md5checksum == null ? "null" : "\"" + md5checksum + "\"") + ", molecularWeight=" + molecularWeight + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryAccession=" + (primaryAccession == null ? "null" : "\"" + primaryAccession + "\"") + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", secondaryIdentifier=" + (secondaryIdentifier == null ? "null" : "\"" + secondaryIdentifier + "\"") + ", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + ", symbol=" + (symbol == null ? "null" : "\"" + symbol + "\"") + ", uniprotAccession=" + (uniprotAccession == null ? "null" : "\"" + uniprotAccession + "\"") + ", uniprotName=" + (uniprotName == null ? "null" : "\"" + uniprotName + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("md5checksum".equals(fieldName)) {
            return md5checksum;
        }
        if ("primaryAccession".equals(fieldName)) {
            return primaryAccession;
        }
        if ("molecularWeight".equals(fieldName)) {
            return molecularWeight;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("isFragment".equals(fieldName)) {
            return isFragment;
        }
        if ("uniprotAccession".equals(fieldName)) {
            return uniprotAccession;
        }
        if ("isUniprotCanonical".equals(fieldName)) {
            return isUniprotCanonical;
        }
        if ("uniprotName".equals(fieldName)) {
            return uniprotName;
        }
        if ("canonicalProtein".equals(fieldName)) {
            if (canonicalProtein instanceof ProxyReference) {
                return ((ProxyReference) canonicalProtein).getObject();
            } else {
                return canonicalProtein;
            }
        }
        if ("sequence".equals(fieldName)) {
            if (sequence instanceof ProxyReference) {
                return ((ProxyReference) sequence).getObject();
            } else {
                return sequence;
            }
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("ecNumbers".equals(fieldName)) {
            return ecNumbers;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("isoforms".equals(fieldName)) {
            return isoforms;
        }
        if ("keywords".equals(fieldName)) {
            return keywords;
        }
        if ("components".equals(fieldName)) {
            return components;
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("features".equals(fieldName)) {
            return features;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("md5checksum".equals(fieldName)) {
            return md5checksum;
        }
        if ("primaryAccession".equals(fieldName)) {
            return primaryAccession;
        }
        if ("molecularWeight".equals(fieldName)) {
            return molecularWeight;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("isFragment".equals(fieldName)) {
            return isFragment;
        }
        if ("uniprotAccession".equals(fieldName)) {
            return uniprotAccession;
        }
        if ("isUniprotCanonical".equals(fieldName)) {
            return isUniprotCanonical;
        }
        if ("uniprotName".equals(fieldName)) {
            return uniprotName;
        }
        if ("canonicalProtein".equals(fieldName)) {
            return canonicalProtein;
        }
        if ("sequence".equals(fieldName)) {
            return sequence;
        }
        if ("CDSs".equals(fieldName)) {
            return CDSs;
        }
        if ("comments".equals(fieldName)) {
            return comments;
        }
        if ("ecNumbers".equals(fieldName)) {
            return ecNumbers;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("isoforms".equals(fieldName)) {
            return isoforms;
        }
        if ("keywords".equals(fieldName)) {
            return keywords;
        }
        if ("components".equals(fieldName)) {
            return components;
        }
        if ("transcripts".equals(fieldName)) {
            return transcripts;
        }
        if ("features".equals(fieldName)) {
            return features;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("md5checksum".equals(fieldName)) {
            md5checksum = (java.lang.String) value;
        } else if ("primaryAccession".equals(fieldName)) {
            primaryAccession = (java.lang.String) value;
        } else if ("molecularWeight".equals(fieldName)) {
            molecularWeight = (java.lang.Double) value;
        } else if ("length".equals(fieldName)) {
            length = (java.lang.Integer) value;
        } else if ("isFragment".equals(fieldName)) {
            isFragment = (java.lang.Boolean) value;
        } else if ("uniprotAccession".equals(fieldName)) {
            uniprotAccession = (java.lang.String) value;
        } else if ("isUniprotCanonical".equals(fieldName)) {
            isUniprotCanonical = (java.lang.Boolean) value;
        } else if ("uniprotName".equals(fieldName)) {
            uniprotName = (java.lang.String) value;
        } else if ("canonicalProtein".equals(fieldName)) {
            canonicalProtein = (org.intermine.model.InterMineObject) value;
        } else if ("sequence".equals(fieldName)) {
            sequence = (org.intermine.model.InterMineObject) value;
        } else if ("CDSs".equals(fieldName)) {
            CDSs = (java.util.Set) value;
        } else if ("comments".equals(fieldName)) {
            comments = (java.util.Set) value;
        } else if ("ecNumbers".equals(fieldName)) {
            ecNumbers = (java.util.Set) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("isoforms".equals(fieldName)) {
            isoforms = (java.util.Set) value;
        } else if ("keywords".equals(fieldName)) {
            keywords = (java.util.Set) value;
        } else if ("components".equals(fieldName)) {
            components = (java.util.Set) value;
        } else if ("transcripts".equals(fieldName)) {
            transcripts = (java.util.Set) value;
        } else if ("features".equals(fieldName)) {
            features = (java.util.Set) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures = (java.util.Set) value;
        } else if ("locations".equals(fieldName)) {
            locations = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences = (java.util.Set) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("md5checksum".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("molecularWeight".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("length".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("isFragment".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("uniprotAccession".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("isUniprotCanonical".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("uniprotName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("canonicalProtein".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("sequence".equals(fieldName)) {
            return org.intermine.model.bio.Sequence.class;
        }
        if ("CDSs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("comments".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("ecNumbers".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("isoforms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("keywords".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("components".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("transcripts".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("features".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("locations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Protein.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Protein");
        if (md5checksum != null) {
            sb.append("$_^amd5checksum$_^");
            String string = md5checksum;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (primaryAccession != null) {
            sb.append("$_^aprimaryAccession$_^");
            String string = primaryAccession;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (molecularWeight != null) {
            sb.append("$_^amolecularWeight$_^").append(molecularWeight);
        }
        if (length != null) {
            sb.append("$_^alength$_^").append(length);
        }
        if (isFragment != null) {
            sb.append("$_^aisFragment$_^").append(isFragment);
        }
        if (uniprotAccession != null) {
            sb.append("$_^auniprotAccession$_^");
            String string = uniprotAccession;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (isUniprotCanonical != null) {
            sb.append("$_^aisUniprotCanonical$_^").append(isUniprotCanonical);
        }
        if (uniprotName != null) {
            sb.append("$_^auniprotName$_^");
            String string = uniprotName;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (canonicalProtein != null) {
            sb.append("$_^rcanonicalProtein$_^").append(canonicalProtein.getId());
        }
        if (sequence != null) {
            sb.append("$_^rsequence$_^").append(sequence.getId());
        }
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (secondaryIdentifier != null) {
            sb.append("$_^asecondaryIdentifier$_^");
            String string = secondaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (primaryIdentifier != null) {
            sb.append("$_^aprimaryIdentifier$_^");
            String string = primaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.ProteinShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Protein)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "amd5checksum".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                md5checksum = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aprimaryAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amolecularWeight".equals(notXml[i])) {
                i++;
                molecularWeight = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aisFragment".equals(notXml[i])) {
                i++;
                isFragment = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "auniprotAccession".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                uniprotAccession = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aisUniprotCanonical".equals(notXml[i])) {
                i++;
                isUniprotCanonical = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "auniprotName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                uniprotName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rcanonicalProtein".equals(notXml[i])) {
                i++;
                canonicalProtein = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Protein.class);
                i++;
            };
            if ((i < notXml.length) &&"rsequence".equals(notXml[i])) {
                i++;
                sequence = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Sequence.class);
                i++;
            };
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asecondaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                secondaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) && "aprimaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        CDSs = new ProxyCollection<org.intermine.model.bio.CDS>(os, this, "CDSs", org.intermine.model.bio.CDS.class);
        comments = new ProxyCollection<org.intermine.model.bio.Comment>(os, this, "comments", org.intermine.model.bio.Comment.class);
        ecNumbers = new ProxyCollection<org.intermine.model.bio.ECNumber>(os, this, "ecNumbers", org.intermine.model.bio.ECNumber.class);
        genes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "genes", org.intermine.model.bio.Gene.class);
        isoforms = new ProxyCollection<org.intermine.model.bio.Protein>(os, this, "isoforms", org.intermine.model.bio.Protein.class);
        keywords = new ProxyCollection<org.intermine.model.bio.OntologyTerm>(os, this, "keywords", org.intermine.model.bio.OntologyTerm.class);
        components = new ProxyCollection<org.intermine.model.bio.Component>(os, this, "components", org.intermine.model.bio.Component.class);
        transcripts = new ProxyCollection<org.intermine.model.bio.Transcript>(os, this, "transcripts", org.intermine.model.bio.Transcript.class);
        features = new ProxyCollection<org.intermine.model.bio.UniProtFeature>(os, this, "features", org.intermine.model.bio.UniProtFeature.class);
        locatedFeatures = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locatedFeatures", org.intermine.model.bio.Location.class);
        locations = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locations", org.intermine.model.bio.Location.class);
        synonyms = new ProxyCollection<org.intermine.model.bio.Synonym>(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        crossReferences = new ProxyCollection<org.intermine.model.bio.CrossReference>(os, this, "crossReferences", org.intermine.model.bio.CrossReference.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("CDSs".equals(fieldName)) {
            CDSs.add((org.intermine.model.bio.CDS) element);
        } else if ("comments".equals(fieldName)) {
            comments.add((org.intermine.model.bio.Comment) element);
        } else if ("ecNumbers".equals(fieldName)) {
            ecNumbers.add((org.intermine.model.bio.ECNumber) element);
        } else if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else if ("isoforms".equals(fieldName)) {
            isoforms.add((org.intermine.model.bio.Protein) element);
        } else if ("keywords".equals(fieldName)) {
            keywords.add((org.intermine.model.bio.OntologyTerm) element);
        } else if ("components".equals(fieldName)) {
            components.add((org.intermine.model.bio.Component) element);
        } else if ("transcripts".equals(fieldName)) {
            transcripts.add((org.intermine.model.bio.Transcript) element);
        } else if ("features".equals(fieldName)) {
            features.add((org.intermine.model.bio.UniProtFeature) element);
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures.add((org.intermine.model.bio.Location) element);
        } else if ("locations".equals(fieldName)) {
            locations.add((org.intermine.model.bio.Location) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.Synonym) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences.add((org.intermine.model.bio.CrossReference) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("CDSs".equals(fieldName)) {
            return org.intermine.model.bio.CDS.class;
        }
        if ("comments".equals(fieldName)) {
            return org.intermine.model.bio.Comment.class;
        }
        if ("ecNumbers".equals(fieldName)) {
            return org.intermine.model.bio.ECNumber.class;
        }
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("isoforms".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("keywords".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("components".equals(fieldName)) {
            return org.intermine.model.bio.Component.class;
        }
        if ("transcripts".equals(fieldName)) {
            return org.intermine.model.bio.Transcript.class;
        }
        if ("features".equals(fieldName)) {
            return org.intermine.model.bio.UniProtFeature.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("locations".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.Synonym.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return org.intermine.model.bio.CrossReference.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.Protein.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Protein.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
