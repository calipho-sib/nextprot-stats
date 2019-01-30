package org.nextprot.stats.publication;

public interface PublicationService {

	/**
	 * Compute statistics on a given publication
	 * @param publicationId the publication id
	 */
	PublicationStatistics.PublicationStats calcPublicationStatistics(long publicationId);
}
