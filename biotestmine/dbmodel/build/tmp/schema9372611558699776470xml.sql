
-----------------------------------------------------------------------------
-- UserProfile
-----------------------------------------------------------------------------
DROP TABLE UserProfile CASCADE;


CREATE TABLE UserProfile
(
    superuser BOOLEAN NOT NULL,
    id INTEGER NOT NULL,
    password TEXT,
    username TEXT,
    apiKey TEXT,
    localAccount BOOLEAN NOT NULL,
    CONSTRAINT UserProfile_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- SavedBag
-----------------------------------------------------------------------------
DROP TABLE SavedBag CASCADE;


CREATE TABLE SavedBag
(
    description TEXT,
    id INTEGER NOT NULL,
    osbId INTEGER NOT NULL,
    intermine_state TEXT,
    type TEXT,
    name TEXT,
    dateCreated INT8,
    userProfileId INTEGER,
    CONSTRAINT SavedBag_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- SavedQuery
-----------------------------------------------------------------------------
DROP TABLE SavedQuery CASCADE;


CREATE TABLE SavedQuery
(
    id INTEGER NOT NULL,
    query TEXT,
    userProfileId INTEGER,
    CONSTRAINT SavedQuery_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- SavedTemplateQuery
-----------------------------------------------------------------------------
DROP TABLE SavedTemplateQuery CASCADE;


CREATE TABLE SavedTemplateQuery
(
    id INTEGER NOT NULL,
    templateQuery TEXT,
    userProfileId INTEGER,
    CONSTRAINT SavedTemplateQuery_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- Tag
-----------------------------------------------------------------------------
DROP TABLE Tag CASCADE;


CREATE TABLE Tag
(
    id INTEGER NOT NULL,
    objectIdentifier TEXT,
    type TEXT,
    tagName TEXT,
    userProfileId INTEGER,
    CONSTRAINT Tag_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- TemplateSummary
-----------------------------------------------------------------------------
DROP TABLE TemplateSummary CASCADE;


CREATE TABLE TemplateSummary
(
    summary TEXT,
    id INTEGER NOT NULL,
    templateId INTEGER,
    CONSTRAINT TemplateSummary_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- PermanentToken
-----------------------------------------------------------------------------
DROP TABLE PermanentToken CASCADE;


CREATE TABLE PermanentToken
(
    id INTEGER NOT NULL,
    intermine_level TEXT,
    token TEXT,
    dateCreated INT8,
    message TEXT,
    userProfileId INTEGER,
    CONSTRAINT PermanentToken_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- intermine_metadata
-----------------------------------------------------------------------------
DROP TABLE intermine_metadata CASCADE;


CREATE TABLE intermine_metadata
(
    key TEXT,
    value TEXT,
    blob_value BYTEA,
    CONSTRAINT intermine_metadata_key UNIQUE (key)
);


-----------------------------------------------------------------------------
-- osbag_int
-----------------------------------------------------------------------------
DROP TABLE osbag_int CASCADE;


CREATE TABLE osbag_int
(
    bagid INTEGER,
    value INTEGER,
    CONSTRAINT osbag_int_index1 UNIQUE (bagid, value)
);
CREATE INDEX osbag_int_index2 ON osbag_int (value, bagid);


-----------------------------------------------------------------------------
-- clob
-----------------------------------------------------------------------------
DROP TABLE clob CASCADE;


CREATE TABLE clob
(
    clobid INTEGER,
    clobpage INTEGER,
    value TEXT,
    CONSTRAINT clob_index UNIQUE (clobid, clobpage)
);


----------------------------------------------------------------------
-- clob                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- UserProfile                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- SavedBag                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- SavedQuery                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- SavedTemplateQuery                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Tag                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- TemplateSummary                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- PermanentToken                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- intermine_metadata                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- osbag_int                                                      
----------------------------------------------------------------------

