package org.neo4j.scala

import org.neo4j.graphdb.GraphDatabaseService
import org.neo4j.tooling.GlobalGraphOperations

/**
 * Interface for GraphDatabaseService
 * @author Christopher Schmidt
 *
 */
trait DatabaseService {
  def gds: GraphDatabaseService
  lazy val ggo: GlobalGraphOperations = GlobalGraphOperations.at(gds)
}

/**
 * standard DatabaseService implementation
 * for GraphDatabaseService
 */
case class DatabaseServiceImpl(gds: GraphDatabaseService) extends DatabaseService

