/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.message.boards.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for MBCategory. This utility wraps
 * {@link com.liferay.message.boards.service.impl.MBCategoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MBCategoryLocalService
 * @see com.liferay.message.boards.service.base.MBCategoryLocalServiceBaseImpl
 * @see com.liferay.message.boards.service.impl.MBCategoryLocalServiceImpl
 * @generated
 */
@ProviderType
public class MBCategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.message.boards.service.impl.MBCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the message boards category to the database. Also notifies the appropriate model listeners.
	*
	* @param mbCategory the message boards category
	* @return the message boards category that was added
	*/
	public static com.liferay.message.boards.model.MBCategory addMBCategory(
		com.liferay.message.boards.model.MBCategory mbCategory) {
		return getService().addMBCategory(mbCategory);
	}

	/**
	* Creates a new message boards category with the primary key. Does not add the message boards category to the database.
	*
	* @param categoryId the primary key for the new message boards category
	* @return the new message boards category
	*/
	public static com.liferay.message.boards.model.MBCategory createMBCategory(
		long categoryId) {
		return getService().createMBCategory(categoryId);
	}

	/**
	* Deletes the message boards category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the message boards category
	* @return the message boards category that was removed
	* @throws PortalException if a message boards category with the primary key could not be found
	*/
	public static com.liferay.message.boards.model.MBCategory deleteMBCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteMBCategory(categoryId);
	}

	/**
	* Deletes the message boards category from the database. Also notifies the appropriate model listeners.
	*
	* @param mbCategory the message boards category
	* @return the message boards category that was removed
	*/
	public static com.liferay.message.boards.model.MBCategory deleteMBCategory(
		com.liferay.message.boards.model.MBCategory mbCategory) {
		return getService().deleteMBCategory(mbCategory);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.message.boards.model.impl.MBCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.message.boards.model.impl.MBCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.message.boards.model.MBCategory fetchMBCategory(
		long categoryId) {
		return getService().fetchMBCategory(categoryId);
	}

	/**
	* Returns the message boards category matching the UUID and group.
	*
	* @param uuid the message boards category's UUID
	* @param groupId the primary key of the group
	* @return the matching message boards category, or <code>null</code> if a matching message boards category could not be found
	*/
	public static com.liferay.message.boards.model.MBCategory fetchMBCategoryByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchMBCategoryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns a range of all the message boards categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.message.boards.model.impl.MBCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of message boards categories
	* @param end the upper bound of the range of message boards categories (not inclusive)
	* @return the range of message boards categories
	*/
	public static java.util.List<com.liferay.message.boards.model.MBCategory> getMBCategories(
		int start, int end) {
		return getService().getMBCategories(start, end);
	}

	/**
	* Returns all the message boards categories matching the UUID and company.
	*
	* @param uuid the UUID of the message boards categories
	* @param companyId the primary key of the company
	* @return the matching message boards categories, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.message.boards.model.MBCategory> getMBCategoriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getMBCategoriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of message boards categories matching the UUID and company.
	*
	* @param uuid the UUID of the message boards categories
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of message boards categories
	* @param end the upper bound of the range of message boards categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching message boards categories, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.message.boards.model.MBCategory> getMBCategoriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.message.boards.model.MBCategory> orderByComparator) {
		return getService()
				   .getMBCategoriesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of message boards categories.
	*
	* @return the number of message boards categories
	*/
	public static int getMBCategoriesCount() {
		return getService().getMBCategoriesCount();
	}

	/**
	* Returns the message boards category with the primary key.
	*
	* @param categoryId the primary key of the message boards category
	* @return the message boards category
	* @throws PortalException if a message boards category with the primary key could not be found
	*/
	public static com.liferay.message.boards.model.MBCategory getMBCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getMBCategory(categoryId);
	}

	/**
	* Returns the message boards category matching the UUID and group.
	*
	* @param uuid the message boards category's UUID
	* @param groupId the primary key of the group
	* @return the matching message boards category
	* @throws PortalException if a matching message boards category could not be found
	*/
	public static com.liferay.message.boards.model.MBCategory getMBCategoryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getMBCategoryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the message boards category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mbCategory the message boards category
	* @return the message boards category that was updated
	*/
	public static com.liferay.message.boards.model.MBCategory updateMBCategory(
		com.liferay.message.boards.model.MBCategory mbCategory) {
		return getService().updateMBCategory(mbCategory);
	}

	public static MBCategoryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MBCategoryLocalService, MBCategoryLocalService> _serviceTracker =
		ServiceTrackerFactory.open(MBCategoryLocalService.class);
}