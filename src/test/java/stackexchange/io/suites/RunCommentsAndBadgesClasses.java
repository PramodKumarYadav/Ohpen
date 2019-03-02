package stackexchange.io.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import stackexchange.io.badges.TestGetAllBadgesOnSite;
import stackexchange.io.comments.TestGetAllCommentsOnSite;
import stackexchange.io.privileges.TestGetAllPrivileges;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestGetAllCommentsOnSite.class,
        TestGetAllBadgesOnSite.class
})

public class RunCommentsAndBadgesClasses {
}
