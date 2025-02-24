package su.vistar.Openstreetmaps.repositories.RouteRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import su.vistar.Openstreetmaps.models.Routes.RouteStop;

@Repository
public interface RouteStopRepository extends JpaRepository<RouteStop, Long> {
}
