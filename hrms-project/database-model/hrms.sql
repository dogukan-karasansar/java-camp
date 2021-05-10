SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;
SET default_tablespace = '';
SET default_table_access_method = heap;
CREATE TABLE public.employers (
    id integer NOT NULL,
    user_id integer NOT NULL,
    company_name character varying(250) NOT NULL,
    phone character varying(250) NOT NULL,
    web_sites character varying(250) NOT NULL
);
CREATE SEQUENCE public.employers_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
ALTER SEQUENCE public.employers_id_seq OWNED BY public.employers.id;
CREATE TABLE public.job_positions (
    id integer NOT NULL,
    position_name character varying(500)
);
CREATE SEQUENCE public.job_positions_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
ALTER SEQUENCE public.job_positions_id_seq OWNED BY public.job_positions.id;
CREATE TABLE public.job_seekers (
    id integer NOT NULL,
    user_id integer NOT NULL,
    first_name character varying(150) NOT NULL,
    last_name character varying(150) NOT NULL,
    birth_date date NOT NULL,
    national_indentity character varying(100) NOT NULL,
    mernis_verified boolean DEFAULT false NOT NULL
);
CREATE SEQUENCE public.job_seekers_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
ALTER SEQUENCE public.job_seekers_id_seq OWNED BY public.job_seekers.id;
CREATE TABLE public.system_personnels (
    id integer NOT NULL,
    user_id integer NOT NULL,
    first_name character varying(150) NOT NULL,
    last_name character varying(150) NOT NULL
);
CREATE SEQUENCE public.system_personnels_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
ALTER SEQUENCE public.system_personnels_id_seq OWNED BY public.system_personnels.id;
CREATE TABLE public.users (
    id integer NOT NULL,
    email character varying(100) NOT NULL,
    password character varying(100) NOT NULL,
    email_verified boolean DEFAULT false NOT NULL
);
CREATE SEQUENCE public.users_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
ALTER SEQUENCE public.users_id_seq OWNED BY public.users.id;
ALTER TABLE ONLY public.employers ALTER COLUMN id SET DEFAULT nextval('public.employers_id_seq'::regclass);
ALTER TABLE ONLY public.job_positions ALTER COLUMN id SET DEFAULT nextval('public.job_positions_id_seq'::regclass);
ALTER TABLE ONLY public.job_seekers ALTER COLUMN id SET DEFAULT nextval('public.job_seekers_id_seq'::regclass);
ALTER TABLE ONLY public.system_personnels ALTER COLUMN id SET DEFAULT nextval('public.system_personnels_id_seq'::regclass);
ALTER TABLE ONLY public.users ALTER COLUMN id SET DEFAULT nextval('public.users_id_seq'::regclass);
ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_pkey PRIMARY KEY (id);
ALTER TABLE ONLY public.job_positions
    ADD CONSTRAINT job_positions_pkey PRIMARY KEY (id);
ALTER TABLE ONLY public.job_seekers
    ADD CONSTRAINT job_seekers_national_indentity_key UNIQUE (national_indentity);
ALTER TABLE ONLY public.job_seekers
    ADD CONSTRAINT job_seekers_pkey PRIMARY KEY (id);
ALTER TABLE ONLY public.system_personnels
    ADD CONSTRAINT system_personnels_pkey PRIMARY KEY (id);
ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_email_key UNIQUE (email);
ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
ALTER TABLE ONLY public.employers
    ADD CONSTRAINT hrms_employer_user FOREIGN KEY (user_id) REFERENCES public.users(id) ON DELETE SET NULL;
ALTER TABLE ONLY public.job_seekers
    ADD CONSTRAINT hrms_job_seeker_user FOREIGN KEY (user_id) REFERENCES public.users(id) ON DELETE SET NULL;
ALTER TABLE ONLY public.system_personnels
    ADD CONSTRAINT hrms_system_personnels FOREIGN KEY (user_id) REFERENCES public.users(id) ON DELETE SET NULL;