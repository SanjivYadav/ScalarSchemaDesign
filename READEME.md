Server [localhost]:
Database [postgres]:
Port [5432]:
Username [postgres]:
Password for user postgres:
psql (14.4)
WARNING: Console code page (437) differs from Windows code page (1252)
8-bit characters might not work correctly. See psql reference
page "Notes for Windows users" for details.
Type "help" for help.

postgres=# psql
postgres-# psql -U username
postgres-# create database scalar_schema
postgres-# create user scalarschema;
ERROR:  syntax error at or near "psql"
LINE 1: psql
^
postgres=# create database dtabasename;
CREATE DATABASE
postgres=# create user user;
CREATE ROLE
postgres=# grant all privileges on database databasename to user;
GRANT
postgres=#