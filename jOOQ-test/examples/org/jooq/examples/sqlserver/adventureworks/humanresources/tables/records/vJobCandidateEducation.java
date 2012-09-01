/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "vJobCandidateEducation", schema = "HumanResources")
public class vJobCandidateEducation extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vJobCandidateEducation> {

	private static final long serialVersionUID = 111557116;

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.JobCandidateID</code>
	 */
	public void setJobCandidateID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.JobCandidateID, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.JobCandidateID</code>
	 */
	@javax.persistence.Column(name = "JobCandidateID", nullable = false, precision = 10)
	public java.lang.Integer getJobCandidateID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.JobCandidateID);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Level</code>
	 */
	public void setEdu_Level(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Level, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Level</code>
	 */
	@javax.persistence.Column(name = "Edu.Level")
	public java.lang.String getEdu_Level() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Level);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.StartDate</code>
	 */
	public void setEdu_StartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_StartDate, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.StartDate</code>
	 */
	@javax.persistence.Column(name = "Edu.StartDate")
	public java.sql.Timestamp getEdu_StartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_StartDate);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.EndDate</code>
	 */
	public void setEdu_EndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_EndDate, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.EndDate</code>
	 */
	@javax.persistence.Column(name = "Edu.EndDate")
	public java.sql.Timestamp getEdu_EndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_EndDate);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Degree</code>
	 */
	public void setEdu_Degree(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Degree, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Degree</code>
	 */
	@javax.persistence.Column(name = "Edu.Degree", length = 50)
	public java.lang.String getEdu_Degree() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Degree);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Major</code>
	 */
	public void setEdu_Major(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Major, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Major</code>
	 */
	@javax.persistence.Column(name = "Edu.Major", length = 50)
	public java.lang.String getEdu_Major() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Major);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Minor</code>
	 */
	public void setEdu_Minor(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Minor, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Minor</code>
	 */
	@javax.persistence.Column(name = "Edu.Minor", length = 50)
	public java.lang.String getEdu_Minor() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Minor);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.GPA</code>
	 */
	public void setEdu_GPA(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_GPA, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.GPA</code>
	 */
	@javax.persistence.Column(name = "Edu.GPA", length = 5)
	public java.lang.String getEdu_GPA() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_GPA);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.GPAScale</code>
	 */
	public void setEdu_GPAScale(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_GPAScale, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.GPAScale</code>
	 */
	@javax.persistence.Column(name = "Edu.GPAScale", length = 5)
	public java.lang.String getEdu_GPAScale() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_GPAScale);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.School</code>
	 */
	public void setEdu_School(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_School, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.School</code>
	 */
	@javax.persistence.Column(name = "Edu.School", length = 100)
	public java.lang.String getEdu_School() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_School);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Loc.CountryRegion</code>
	 */
	public void setEdu_Loc_CountryRegion(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Loc_CountryRegion, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Loc.CountryRegion</code>
	 */
	@javax.persistence.Column(name = "Edu.Loc.CountryRegion", length = 100)
	public java.lang.String getEdu_Loc_CountryRegion() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Loc_CountryRegion);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Loc.State</code>
	 */
	public void setEdu_Loc_State(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Loc_State, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Loc.State</code>
	 */
	@javax.persistence.Column(name = "Edu.Loc.State", length = 100)
	public java.lang.String getEdu_Loc_State() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Loc_State);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Loc.City</code>
	 */
	public void setEdu_Loc_City(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Loc_City, value);
	}

	/**
	 * The table column <code>HumanResources.vJobCandidateEducation.Edu.Loc.City</code>
	 */
	@javax.persistence.Column(name = "Edu.Loc.City", length = 100)
	public java.lang.String getEdu_Loc_City() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation.Edu_Loc_City);
	}

	/**
	 * Create a detached vJobCandidateEducation
	 */
	public vJobCandidateEducation() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vJobCandidateEducation.vJobCandidateEducation);
	}
}
