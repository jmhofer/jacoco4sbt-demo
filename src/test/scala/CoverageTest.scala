import org.junit.Assert._

class CoverageTest {
  @org.junit.Test
  def main() {
    Test
  }

  @org.junit.Test
  def testFilteredSize: Unit = {
  	assertEquals(3, SourceBranches filteredSizeCoverAllBranches Seq(0, 1, 2, 3, 4))
  	assertEquals(3, SourceBranches filteredSizeCoverLtBranch Seq(0, 1, 2))
  	assertEquals(0, SourceBranches filteredSizeCoverGtEBranch Seq(4, 5, 6))
  }
}
