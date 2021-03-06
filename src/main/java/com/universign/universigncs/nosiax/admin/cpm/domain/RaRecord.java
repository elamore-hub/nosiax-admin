package com.universign.universigncs.nosiax.admin.cpm.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import com.universign.universigncs.nosiax.admin.cpm.domain.enumeration.Status;

/**
 * A RaRecord.
 */
@Entity
@Table(name = "ra_record")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RaRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @NotNull
    @Column(name = "id_user", nullable = false)
    private String idUser;

    @NotNull
    @Column(name = "identifier", nullable = false)
    private String identifier;

    @NotNull
    @Column(name = "cert_o", nullable = false)
    private String certO;

    @NotNull
    @Column(name = "common_name", nullable = false)
    private String commonName;

    @NotNull
    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    @NotNull
    @Column(name = "locality", nullable = false)
    private String locality;

    @NotNull
    @Column(name = "country", nullable = false)
    private String country;

    @NotNull
    @Column(name = "lastname", nullable = false)
    private String lastname;

    @NotNull
    @Column(name = "firstname", nullable = false)
    private String firstname;

    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "url")
    private String url;

    @Column(name = "id_transaction")
    private String idTransaction;

    @Column(name = "transaction_status")
    private String transactionStatus;

    @Column(name = "profil_cpm")
    private String profilCpm;

    @Column(name = "reaso")
    private String reaso;

    @Column(name = "signature_date")
    private ZonedDateTime signatureDate;

    @Column(name = "validation_date")
    private ZonedDateTime validationDate;

    @OneToMany(mappedBy = "raRecord")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Voucher> voutchers = new HashSet<>();

    @OneToMany(mappedBy = "raRecord")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<AdditionalKeys> additionalKeys = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public RaRecord status(Status status) {
        this.status = status;
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getIdUser() {
        return idUser;
    }

    public RaRecord idUser(String idUser) {
        this.idUser = idUser;
        return this;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdentifier() {
        return identifier;
    }

    public RaRecord identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCertO() {
        return certO;
    }

    public RaRecord certO(String certO) {
        this.certO = certO;
        return this;
    }

    public void setCertO(String certO) {
        this.certO = certO;
    }

    public String getCommonName() {
        return commonName;
    }

    public RaRecord commonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public RaRecord zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLocality() {
        return locality;
    }

    public RaRecord locality(String locality) {
        this.locality = locality;
        return this;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCountry() {
        return country;
    }

    public RaRecord country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastname() {
        return lastname;
    }

    public RaRecord lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public RaRecord firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public RaRecord email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public RaRecord phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public RaRecord url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public RaRecord idTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
        return this;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public RaRecord transactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getProfilCpm() {
        return profilCpm;
    }

    public RaRecord profilCpm(String profilCpm) {
        this.profilCpm = profilCpm;
        return this;
    }

    public void setProfilCpm(String profilCpm) {
        this.profilCpm = profilCpm;
    }

    public String getReaso() {
        return reaso;
    }

    public RaRecord reaso(String reaso) {
        this.reaso = reaso;
        return this;
    }

    public void setReaso(String reaso) {
        this.reaso = reaso;
    }

    public ZonedDateTime getSignatureDate() {
        return signatureDate;
    }

    public RaRecord signatureDate(ZonedDateTime signatureDate) {
        this.signatureDate = signatureDate;
        return this;
    }

    public void setSignatureDate(ZonedDateTime signatureDate) {
        this.signatureDate = signatureDate;
    }

    public ZonedDateTime getValidationDate() {
        return validationDate;
    }

    public RaRecord validationDate(ZonedDateTime validationDate) {
        this.validationDate = validationDate;
        return this;
    }

    public void setValidationDate(ZonedDateTime validationDate) {
        this.validationDate = validationDate;
    }

    public Set<Voucher> getVoutchers() {
        return voutchers;
    }

    public RaRecord voutchers(Set<Voucher> vouchers) {
        this.voutchers = vouchers;
        return this;
    }

    public RaRecord addVoutcher(Voucher voucher) {
        this.voutchers.add(voucher);
        voucher.setRaRecord(this);
        return this;
    }

    public RaRecord removeVoutcher(Voucher voucher) {
        this.voutchers.remove(voucher);
        voucher.setRaRecord(null);
        return this;
    }

    public void setVoutchers(Set<Voucher> vouchers) {
        this.voutchers = vouchers;
    }

    public Set<AdditionalKeys> getAdditionalKeys() {
        return additionalKeys;
    }

    public RaRecord additionalKeys(Set<AdditionalKeys> additionalKeys) {
        this.additionalKeys = additionalKeys;
        return this;
    }

    public RaRecord addAdditionalKeys(AdditionalKeys additionalKeys) {
        this.additionalKeys.add(additionalKeys);
        additionalKeys.setRaRecord(this);
        return this;
    }

    public RaRecord removeAdditionalKeys(AdditionalKeys additionalKeys) {
        this.additionalKeys.remove(additionalKeys);
        additionalKeys.setRaRecord(null);
        return this;
    }

    public void setAdditionalKeys(Set<AdditionalKeys> additionalKeys) {
        this.additionalKeys = additionalKeys;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RaRecord)) {
            return false;
        }
        return id != null && id.equals(((RaRecord) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "RaRecord{" +
            "id=" + getId() +
            ", status='" + getStatus() + "'" +
            ", idUser='" + getIdUser() + "'" +
            ", identifier='" + getIdentifier() + "'" +
            ", certO='" + getCertO() + "'" +
            ", commonName='" + getCommonName() + "'" +
            ", zipCode='" + getZipCode() + "'" +
            ", locality='" + getLocality() + "'" +
            ", country='" + getCountry() + "'" +
            ", lastname='" + getLastname() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", url='" + getUrl() + "'" +
            ", idTransaction='" + getIdTransaction() + "'" +
            ", transactionStatus='" + getTransactionStatus() + "'" +
            ", profilCpm='" + getProfilCpm() + "'" +
            ", reaso='" + getReaso() + "'" +
            ", signatureDate='" + getSignatureDate() + "'" +
            ", validationDate='" + getValidationDate() + "'" +
            "}";
    }
}
