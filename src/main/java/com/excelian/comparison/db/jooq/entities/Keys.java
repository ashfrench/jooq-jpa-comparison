/**
 * This class is generated by jOOQ
 */
package com.excelian.comparison.db.jooq.entities;


import com.excelian.comparison.db.jooq.entities.tables.Actor;
import com.excelian.comparison.db.jooq.entities.tables.Address;
import com.excelian.comparison.db.jooq.entities.tables.Category;
import com.excelian.comparison.db.jooq.entities.tables.City;
import com.excelian.comparison.db.jooq.entities.tables.Country;
import com.excelian.comparison.db.jooq.entities.tables.Customer;
import com.excelian.comparison.db.jooq.entities.tables.Film;
import com.excelian.comparison.db.jooq.entities.tables.FilmActor;
import com.excelian.comparison.db.jooq.entities.tables.FilmCategory;
import com.excelian.comparison.db.jooq.entities.tables.FilmText;
import com.excelian.comparison.db.jooq.entities.tables.Inventory;
import com.excelian.comparison.db.jooq.entities.tables.Language;
import com.excelian.comparison.db.jooq.entities.tables.Payment;
import com.excelian.comparison.db.jooq.entities.tables.Rental;
import com.excelian.comparison.db.jooq.entities.tables.Staff;
import com.excelian.comparison.db.jooq.entities.tables.Store;
import com.excelian.comparison.db.jooq.entities.tables.records.ActorRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.AddressRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.CategoryRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.CityRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.CountryRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.CustomerRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.FilmActorRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.FilmCategoryRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.FilmRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.FilmTextRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.InventoryRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.LanguageRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.PaymentRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.RentalRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.StaffRecord;
import com.excelian.comparison.db.jooq.entities.tables.records.StoreRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * A class modelling foreign key relationships between tables of the <code>sakila</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ActorRecord, UShort> IDENTITY_ACTOR = Identities0.IDENTITY_ACTOR;
    public static final Identity<AddressRecord, UShort> IDENTITY_ADDRESS = Identities0.IDENTITY_ADDRESS;
    public static final Identity<CategoryRecord, UByte> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
    public static final Identity<CityRecord, UShort> IDENTITY_CITY = Identities0.IDENTITY_CITY;
    public static final Identity<CountryRecord, UShort> IDENTITY_COUNTRY = Identities0.IDENTITY_COUNTRY;
    public static final Identity<CustomerRecord, UShort> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
    public static final Identity<FilmRecord, UShort> IDENTITY_FILM = Identities0.IDENTITY_FILM;
    public static final Identity<InventoryRecord, UInteger> IDENTITY_INVENTORY = Identities0.IDENTITY_INVENTORY;
    public static final Identity<LanguageRecord, UByte> IDENTITY_LANGUAGE = Identities0.IDENTITY_LANGUAGE;
    public static final Identity<PaymentRecord, UShort> IDENTITY_PAYMENT = Identities0.IDENTITY_PAYMENT;
    public static final Identity<RentalRecord, Integer> IDENTITY_RENTAL = Identities0.IDENTITY_RENTAL;
    public static final Identity<StaffRecord, UByte> IDENTITY_STAFF = Identities0.IDENTITY_STAFF;
    public static final Identity<StoreRecord, UByte> IDENTITY_STORE = Identities0.IDENTITY_STORE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActorRecord> KEY_ACTOR_PRIMARY = UniqueKeys0.KEY_ACTOR_PRIMARY;
    public static final UniqueKey<AddressRecord> KEY_ADDRESS_PRIMARY = UniqueKeys0.KEY_ADDRESS_PRIMARY;
    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = UniqueKeys0.KEY_CATEGORY_PRIMARY;
    public static final UniqueKey<CityRecord> KEY_CITY_PRIMARY = UniqueKeys0.KEY_CITY_PRIMARY;
    public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = UniqueKeys0.KEY_COUNTRY_PRIMARY;
    public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_PRIMARY = UniqueKeys0.KEY_CUSTOMER_PRIMARY;
    public static final UniqueKey<FilmRecord> KEY_FILM_PRIMARY = UniqueKeys0.KEY_FILM_PRIMARY;
    public static final UniqueKey<FilmActorRecord> KEY_FILM_ACTOR_PRIMARY = UniqueKeys0.KEY_FILM_ACTOR_PRIMARY;
    public static final UniqueKey<FilmCategoryRecord> KEY_FILM_CATEGORY_PRIMARY = UniqueKeys0.KEY_FILM_CATEGORY_PRIMARY;
    public static final UniqueKey<FilmTextRecord> KEY_FILM_TEXT_PRIMARY = UniqueKeys0.KEY_FILM_TEXT_PRIMARY;
    public static final UniqueKey<InventoryRecord> KEY_INVENTORY_PRIMARY = UniqueKeys0.KEY_INVENTORY_PRIMARY;
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = UniqueKeys0.KEY_LANGUAGE_PRIMARY;
    public static final UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = UniqueKeys0.KEY_PAYMENT_PRIMARY;
    public static final UniqueKey<RentalRecord> KEY_RENTAL_PRIMARY = UniqueKeys0.KEY_RENTAL_PRIMARY;
    public static final UniqueKey<RentalRecord> KEY_RENTAL_RENTAL_DATE = UniqueKeys0.KEY_RENTAL_RENTAL_DATE;
    public static final UniqueKey<StaffRecord> KEY_STAFF_PRIMARY = UniqueKeys0.KEY_STAFF_PRIMARY;
    public static final UniqueKey<StoreRecord> KEY_STORE_PRIMARY = UniqueKeys0.KEY_STORE_PRIMARY;
    public static final UniqueKey<StoreRecord> KEY_STORE_IDX_UNIQUE_MANAGER = UniqueKeys0.KEY_STORE_IDX_UNIQUE_MANAGER;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AddressRecord, CityRecord> FK_ADDRESS_CITY = ForeignKeys0.FK_ADDRESS_CITY;
    public static final ForeignKey<CityRecord, CountryRecord> FK_CITY_COUNTRY = ForeignKeys0.FK_CITY_COUNTRY;
    public static final ForeignKey<CustomerRecord, StoreRecord> FK_CUSTOMER_STORE = ForeignKeys0.FK_CUSTOMER_STORE;
    public static final ForeignKey<CustomerRecord, AddressRecord> FK_CUSTOMER_ADDRESS = ForeignKeys0.FK_CUSTOMER_ADDRESS;
    public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE = ForeignKeys0.FK_FILM_LANGUAGE;
    public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE_ORIGINAL = ForeignKeys0.FK_FILM_LANGUAGE_ORIGINAL;
    public static final ForeignKey<FilmActorRecord, ActorRecord> FK_FILM_ACTOR_ACTOR = ForeignKeys0.FK_FILM_ACTOR_ACTOR;
    public static final ForeignKey<FilmActorRecord, FilmRecord> FK_FILM_ACTOR_FILM = ForeignKeys0.FK_FILM_ACTOR_FILM;
    public static final ForeignKey<FilmCategoryRecord, FilmRecord> FK_FILM_CATEGORY_FILM = ForeignKeys0.FK_FILM_CATEGORY_FILM;
    public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FK_FILM_CATEGORY_CATEGORY = ForeignKeys0.FK_FILM_CATEGORY_CATEGORY;
    public static final ForeignKey<InventoryRecord, FilmRecord> FK_INVENTORY_FILM = ForeignKeys0.FK_INVENTORY_FILM;
    public static final ForeignKey<InventoryRecord, StoreRecord> FK_INVENTORY_STORE = ForeignKeys0.FK_INVENTORY_STORE;
    public static final ForeignKey<PaymentRecord, CustomerRecord> FK_PAYMENT_CUSTOMER = ForeignKeys0.FK_PAYMENT_CUSTOMER;
    public static final ForeignKey<PaymentRecord, StaffRecord> FK_PAYMENT_STAFF = ForeignKeys0.FK_PAYMENT_STAFF;
    public static final ForeignKey<PaymentRecord, RentalRecord> FK_PAYMENT_RENTAL = ForeignKeys0.FK_PAYMENT_RENTAL;
    public static final ForeignKey<RentalRecord, InventoryRecord> FK_RENTAL_INVENTORY = ForeignKeys0.FK_RENTAL_INVENTORY;
    public static final ForeignKey<RentalRecord, CustomerRecord> FK_RENTAL_CUSTOMER = ForeignKeys0.FK_RENTAL_CUSTOMER;
    public static final ForeignKey<RentalRecord, StaffRecord> FK_RENTAL_STAFF = ForeignKeys0.FK_RENTAL_STAFF;
    public static final ForeignKey<StaffRecord, AddressRecord> FK_STAFF_ADDRESS = ForeignKeys0.FK_STAFF_ADDRESS;
    public static final ForeignKey<StaffRecord, StoreRecord> FK_STAFF_STORE = ForeignKeys0.FK_STAFF_STORE;
    public static final ForeignKey<StoreRecord, StaffRecord> FK_STORE_STAFF = ForeignKeys0.FK_STORE_STAFF;
    public static final ForeignKey<StoreRecord, AddressRecord> FK_STORE_ADDRESS = ForeignKeys0.FK_STORE_ADDRESS;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ActorRecord, UShort> IDENTITY_ACTOR = createIdentity(Actor.ACTOR, Actor.ACTOR.ACTOR_ID);
        public static Identity<AddressRecord, UShort> IDENTITY_ADDRESS = createIdentity(Address.ADDRESS, Address.ADDRESS.ADDRESS_ID);
        public static Identity<CategoryRecord, UByte> IDENTITY_CATEGORY = createIdentity(Category.CATEGORY, Category.CATEGORY.CATEGORY_ID);
        public static Identity<CityRecord, UShort> IDENTITY_CITY = createIdentity(City.CITY, City.CITY.CITY_ID);
        public static Identity<CountryRecord, UShort> IDENTITY_COUNTRY = createIdentity(Country.COUNTRY, Country.COUNTRY.COUNTRY_ID);
        public static Identity<CustomerRecord, UShort> IDENTITY_CUSTOMER = createIdentity(Customer.CUSTOMER, Customer.CUSTOMER.CUSTOMER_ID);
        public static Identity<FilmRecord, UShort> IDENTITY_FILM = createIdentity(Film.FILM, Film.FILM.FILM_ID);
        public static Identity<InventoryRecord, UInteger> IDENTITY_INVENTORY = createIdentity(Inventory.INVENTORY, Inventory.INVENTORY.INVENTORY_ID);
        public static Identity<LanguageRecord, UByte> IDENTITY_LANGUAGE = createIdentity(Language.LANGUAGE, Language.LANGUAGE.LANGUAGE_ID);
        public static Identity<PaymentRecord, UShort> IDENTITY_PAYMENT = createIdentity(Payment.PAYMENT, Payment.PAYMENT.PAYMENT_ID);
        public static Identity<RentalRecord, Integer> IDENTITY_RENTAL = createIdentity(Rental.RENTAL, Rental.RENTAL.RENTAL_ID);
        public static Identity<StaffRecord, UByte> IDENTITY_STAFF = createIdentity(Staff.STAFF, Staff.STAFF.STAFF_ID);
        public static Identity<StoreRecord, UByte> IDENTITY_STORE = createIdentity(Store.STORE, Store.STORE.STORE_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ActorRecord> KEY_ACTOR_PRIMARY = createUniqueKey(Actor.ACTOR, "KEY_actor_PRIMARY", Actor.ACTOR.ACTOR_ID);
        public static final UniqueKey<AddressRecord> KEY_ADDRESS_PRIMARY = createUniqueKey(Address.ADDRESS, "KEY_address_PRIMARY", Address.ADDRESS.ADDRESS_ID);
        public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = createUniqueKey(Category.CATEGORY, "KEY_category_PRIMARY", Category.CATEGORY.CATEGORY_ID);
        public static final UniqueKey<CityRecord> KEY_CITY_PRIMARY = createUniqueKey(City.CITY, "KEY_city_PRIMARY", City.CITY.CITY_ID);
        public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = createUniqueKey(Country.COUNTRY, "KEY_country_PRIMARY", Country.COUNTRY.COUNTRY_ID);
        public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_PRIMARY = createUniqueKey(Customer.CUSTOMER, "KEY_customer_PRIMARY", Customer.CUSTOMER.CUSTOMER_ID);
        public static final UniqueKey<FilmRecord> KEY_FILM_PRIMARY = createUniqueKey(Film.FILM, "KEY_film_PRIMARY", Film.FILM.FILM_ID);
        public static final UniqueKey<FilmActorRecord> KEY_FILM_ACTOR_PRIMARY = createUniqueKey(FilmActor.FILM_ACTOR, "KEY_film_actor_PRIMARY", FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID);
        public static final UniqueKey<FilmCategoryRecord> KEY_FILM_CATEGORY_PRIMARY = createUniqueKey(FilmCategory.FILM_CATEGORY, "KEY_film_category_PRIMARY", FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID);
        public static final UniqueKey<FilmTextRecord> KEY_FILM_TEXT_PRIMARY = createUniqueKey(FilmText.FILM_TEXT, "KEY_film_text_PRIMARY", FilmText.FILM_TEXT.FILM_ID);
        public static final UniqueKey<InventoryRecord> KEY_INVENTORY_PRIMARY = createUniqueKey(Inventory.INVENTORY, "KEY_inventory_PRIMARY", Inventory.INVENTORY.INVENTORY_ID);
        public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = createUniqueKey(Language.LANGUAGE, "KEY_language_PRIMARY", Language.LANGUAGE.LANGUAGE_ID);
        public static final UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = createUniqueKey(Payment.PAYMENT, "KEY_payment_PRIMARY", Payment.PAYMENT.PAYMENT_ID);
        public static final UniqueKey<RentalRecord> KEY_RENTAL_PRIMARY = createUniqueKey(Rental.RENTAL, "KEY_rental_PRIMARY", Rental.RENTAL.RENTAL_ID);
        public static final UniqueKey<RentalRecord> KEY_RENTAL_RENTAL_DATE = createUniqueKey(Rental.RENTAL, "KEY_rental_rental_date", Rental.RENTAL.RENTAL_DATE, Rental.RENTAL.INVENTORY_ID, Rental.RENTAL.CUSTOMER_ID);
        public static final UniqueKey<StaffRecord> KEY_STAFF_PRIMARY = createUniqueKey(Staff.STAFF, "KEY_staff_PRIMARY", Staff.STAFF.STAFF_ID);
        public static final UniqueKey<StoreRecord> KEY_STORE_PRIMARY = createUniqueKey(Store.STORE, "KEY_store_PRIMARY", Store.STORE.STORE_ID);
        public static final UniqueKey<StoreRecord> KEY_STORE_IDX_UNIQUE_MANAGER = createUniqueKey(Store.STORE, "KEY_store_idx_unique_manager", Store.STORE.MANAGER_STAFF_ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AddressRecord, CityRecord> FK_ADDRESS_CITY = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_CITY_PRIMARY, Address.ADDRESS, "fk_address_city", Address.ADDRESS.CITY_ID);
        public static final ForeignKey<CityRecord, CountryRecord> FK_CITY_COUNTRY = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_COUNTRY_PRIMARY, City.CITY, "fk_city_country", City.CITY.COUNTRY_ID);
        public static final ForeignKey<CustomerRecord, StoreRecord> FK_CUSTOMER_STORE = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_STORE_PRIMARY, Customer.CUSTOMER, "fk_customer_store", Customer.CUSTOMER.STORE_ID);
        public static final ForeignKey<CustomerRecord, AddressRecord> FK_CUSTOMER_ADDRESS = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_ADDRESS_PRIMARY, Customer.CUSTOMER, "fk_customer_address", Customer.CUSTOMER.ADDRESS_ID);
        public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_LANGUAGE_PRIMARY, Film.FILM, "fk_film_language", Film.FILM.LANGUAGE_ID);
        public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE_ORIGINAL = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_LANGUAGE_PRIMARY, Film.FILM, "fk_film_language_original", Film.FILM.ORIGINAL_LANGUAGE_ID);
        public static final ForeignKey<FilmActorRecord, ActorRecord> FK_FILM_ACTOR_ACTOR = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_ACTOR_PRIMARY, FilmActor.FILM_ACTOR, "fk_film_actor_actor", FilmActor.FILM_ACTOR.ACTOR_ID);
        public static final ForeignKey<FilmActorRecord, FilmRecord> FK_FILM_ACTOR_FILM = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_FILM_PRIMARY, FilmActor.FILM_ACTOR, "fk_film_actor_film", FilmActor.FILM_ACTOR.FILM_ID);
        public static final ForeignKey<FilmCategoryRecord, FilmRecord> FK_FILM_CATEGORY_FILM = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_FILM_PRIMARY, FilmCategory.FILM_CATEGORY, "fk_film_category_film", FilmCategory.FILM_CATEGORY.FILM_ID);
        public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FK_FILM_CATEGORY_CATEGORY = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_CATEGORY_PRIMARY, FilmCategory.FILM_CATEGORY, "fk_film_category_category", FilmCategory.FILM_CATEGORY.CATEGORY_ID);
        public static final ForeignKey<InventoryRecord, FilmRecord> FK_INVENTORY_FILM = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_FILM_PRIMARY, Inventory.INVENTORY, "fk_inventory_film", Inventory.INVENTORY.FILM_ID);
        public static final ForeignKey<InventoryRecord, StoreRecord> FK_INVENTORY_STORE = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_STORE_PRIMARY, Inventory.INVENTORY, "fk_inventory_store", Inventory.INVENTORY.STORE_ID);
        public static final ForeignKey<PaymentRecord, CustomerRecord> FK_PAYMENT_CUSTOMER = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_CUSTOMER_PRIMARY, Payment.PAYMENT, "fk_payment_customer", Payment.PAYMENT.CUSTOMER_ID);
        public static final ForeignKey<PaymentRecord, StaffRecord> FK_PAYMENT_STAFF = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_STAFF_PRIMARY, Payment.PAYMENT, "fk_payment_staff", Payment.PAYMENT.STAFF_ID);
        public static final ForeignKey<PaymentRecord, RentalRecord> FK_PAYMENT_RENTAL = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_RENTAL_PRIMARY, Payment.PAYMENT, "fk_payment_rental", Payment.PAYMENT.RENTAL_ID);
        public static final ForeignKey<RentalRecord, InventoryRecord> FK_RENTAL_INVENTORY = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_INVENTORY_PRIMARY, Rental.RENTAL, "fk_rental_inventory", Rental.RENTAL.INVENTORY_ID);
        public static final ForeignKey<RentalRecord, CustomerRecord> FK_RENTAL_CUSTOMER = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_CUSTOMER_PRIMARY, Rental.RENTAL, "fk_rental_customer", Rental.RENTAL.CUSTOMER_ID);
        public static final ForeignKey<RentalRecord, StaffRecord> FK_RENTAL_STAFF = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_STAFF_PRIMARY, Rental.RENTAL, "fk_rental_staff", Rental.RENTAL.STAFF_ID);
        public static final ForeignKey<StaffRecord, AddressRecord> FK_STAFF_ADDRESS = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_ADDRESS_PRIMARY, Staff.STAFF, "fk_staff_address", Staff.STAFF.ADDRESS_ID);
        public static final ForeignKey<StaffRecord, StoreRecord> FK_STAFF_STORE = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_STORE_PRIMARY, Staff.STAFF, "fk_staff_store", Staff.STAFF.STORE_ID);
        public static final ForeignKey<StoreRecord, StaffRecord> FK_STORE_STAFF = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_STAFF_PRIMARY, Store.STORE, "fk_store_staff", Store.STORE.MANAGER_STAFF_ID);
        public static final ForeignKey<StoreRecord, AddressRecord> FK_STORE_ADDRESS = createForeignKey(com.excelian.comparison.db.jooq.entities.Keys.KEY_ADDRESS_PRIMARY, Store.STORE, "fk_store_address", Store.STORE.ADDRESS_ID);
    }
}
