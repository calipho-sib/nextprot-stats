package org.nextprot.stats.publication;

import org.springframework.stereotype.Service;


@Service
public class PublicationServiceImpl implements PublicationService {

	@Override
	public PublicationStatistics.PublicationStats calcPublicationStatistics(long publicationId) {

		// should call api.nextprot.org/entry-publications/pubid/{publicationId}

		// return new PublicationStatisticsAnalyser(publicationId).analyse();
		return PublicationStatistics.PublicationStats.newBuilder()
				.setId(publicationId)
				.setIsCited(false)
				.setIsComputed(false)
				.setIsCurated(false)
				.setIsLargeScale(false)
				.build();
	}
}
