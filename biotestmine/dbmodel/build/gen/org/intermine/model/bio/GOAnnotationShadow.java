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

public class GOAnnotationShadow implements GOAnnotation, ShadowClass
{
    public static final Class<GOAnnotation> shadowOf = GOAnnotation.class;
    // Attr: org.intermine.model.bio.GOAnnotation.annotationExtension
    protected java.lang.String annotationExtension;
    public java.lang.String getAnnotationExtension() { return annotationExtension; }
    public void setAnnotationExtension(final java.lang.String annotationExtension) { this.annotationExtension = annotationExtension; }

    // Attr: org.intermine.model.bio.OntologyAnnotation.qualifier
    protected java.lang.String qualifier;
    public java.lang.String getQualifier() { return qualifier; }
    public void setQualifier(final java.lang.String qualifier) { this.qualifier = qualifier; }

    // Ref: org.intermine.model.bio.OntologyAnnotation.subject
    protected org.intermine.model.InterMineObject subject;
    public org.intermine.model.bio.Annotatable getSubject() { if (subject instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Annotatable) ((org.intermine.objectstore.proxy.ProxyReference) subject).getObject()); }; return (org.intermine.model.bio.Annotatable) subject; }
    public void setSubject(final org.intermine.model.bio.Annotatable subject) { this.subject = subject; }
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject) { this.subject = subject; }
    public org.intermine.model.InterMineObject proxGetSubject() { return subject; }

    // Ref: org.intermine.model.bio.OntologyAnnotation.ontologyTerm
    protected org.intermine.model.InterMineObject ontologyTerm;
    public org.intermine.model.bio.OntologyTerm getOntologyTerm() { if (ontologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) ontologyTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) ontologyTerm; }
    public void setOntologyTerm(final org.intermine.model.bio.OntologyTerm ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public void proxyOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public org.intermine.model.InterMineObject proxGetOntologyTerm() { return ontologyTerm; }

    // Col: org.intermine.model.bio.OntologyAnnotation.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.OntologyAnnotation.evidence
    protected java.util.Set<org.intermine.model.bio.OntologyEvidence> evidence = new java.util.HashSet<org.intermine.model.bio.OntologyEvidence>();
    public java.util.Set<org.intermine.model.bio.OntologyEvidence> getEvidence() { return evidence; }
    public void setEvidence(final java.util.Set<org.intermine.model.bio.OntologyEvidence> evidence) { this.evidence = evidence; }
    public void addEvidence(final org.intermine.model.bio.OntologyEvidence arg) { evidence.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GOAnnotation && id != null) ? id.equals(((GOAnnotation)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GOAnnotation [annotationExtension=" + (annotationExtension == null ? "null" : "\"" + annotationExtension + "\"") + ", id=" + id + ", ontologyTerm=" + (ontologyTerm == null ? "null" : (ontologyTerm.getId() == null ? "no id" : ontologyTerm.getId().toString())) + ", qualifier=" + (qualifier == null ? "null" : "\"" + qualifier + "\"") + ", subject=" + (subject == null ? "null" : (subject.getId() == null ? "no id" : subject.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("annotationExtension".equals(fieldName)) {
            return annotationExtension;
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("subject".equals(fieldName)) {
            if (subject instanceof ProxyReference) {
                return ((ProxyReference) subject).getObject();
            } else {
                return subject;
            }
        }
        if ("ontologyTerm".equals(fieldName)) {
            if (ontologyTerm instanceof ProxyReference) {
                return ((ProxyReference) ontologyTerm).getObject();
            } else {
                return ontologyTerm;
            }
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("annotationExtension".equals(fieldName)) {
            return annotationExtension;
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("subject".equals(fieldName)) {
            return subject;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return ontologyTerm;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("annotationExtension".equals(fieldName)) {
            annotationExtension = (java.lang.String) value;
        } else if ("qualifier".equals(fieldName)) {
            qualifier = (java.lang.String) value;
        } else if ("subject".equals(fieldName)) {
            subject = (org.intermine.model.InterMineObject) value;
        } else if ("ontologyTerm".equals(fieldName)) {
            ontologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("annotationExtension".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("qualifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("subject".equals(fieldName)) {
            return org.intermine.model.bio.Annotatable.class;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("evidence".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GOAnnotation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GOAnnotationShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GOAnnotation");
        if (annotationExtension != null) {
            sb.append("$_^aannotationExtension$_^");
            String string = annotationExtension;
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
        if (qualifier != null) {
            sb.append("$_^aqualifier$_^");
            String string = qualifier;
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
        if (subject != null) {
            sb.append("$_^rsubject$_^").append(subject.getId());
        }
        if (ontologyTerm != null) {
            sb.append("$_^rontologyTerm$_^").append(ontologyTerm.getId());
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
        if (!org.intermine.model.bio.GOAnnotationShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GOAnnotation)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aannotationExtension".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                annotationExtension = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aqualifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                qualifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rsubject".equals(notXml[i])) {
                i++;
                subject = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Annotatable.class);
                i++;
            };
            if ((i < notXml.length) &&"rontologyTerm".equals(notXml[i])) {
                i++;
                ontologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        evidence = new ProxyCollection<org.intermine.model.bio.OntologyEvidence>(os, this, "evidence", org.intermine.model.bio.OntologyEvidence.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.OntologyEvidence) element);
        } else {
            if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("evidence".equals(fieldName)) {
            return org.intermine.model.bio.OntologyEvidence.class;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GOAnnotation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
