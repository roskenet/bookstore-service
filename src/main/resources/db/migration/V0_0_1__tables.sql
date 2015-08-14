CREATE TABLE author (
    id UUID PRIMARY KEY,
    name TEXT,
    web TEXT,
    
    version INTEGER,
    created_by TEXT,
    created_date TIMESTAMP,
    last_modified_by TEXT,
    last_modified_date TIMESTAMP
);
CREATE INDEX ON author(name);

CREATE TABLE book (
    id UUID PRIMARY KEY,
    author_id UUID REFERENCES author(id) ON DELETE CASCADE,
    title TEXT,
    path TEXT,
    
    version INTEGER,
    created_by TEXT,
    created_date TIMESTAMP,
    last_modified_by TEXT,
    last_modified_date TIMESTAMP
);
CREATE INDEX ON book(author_id);