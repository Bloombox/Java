# Contributing to Bloombox for Java

This library is released under the Apache 2.0 license, and you are welcome to
clone it, build it, and hack on it. Contributions back to the source repository
are encouraged! We merge aggressively and support external contributions with
as much vigor as we can.

## Schema Sources

If you're going to develop on the Java codebase, you may find yourself in the
undesirable position of having outdated schema sources. In this case, you may
need to sign an NDA and be granted access to a special repository so you can
sync those sources to your codebase.

You'll need to install a recent copy of the Protobuf C library and compiler,
and any requisite tools like Git and Make (most systems already have these
tools).

## Getting Started

* Make sure you have a [Jira account](https://bloombox.atlassian.net).
* Make sure you have a [GitHub account](https://github.com/signup/free).
* Submit a GitHub or Jira ticket for your issue if one does not already exist.
  * Clearly describe the issue including steps to reproduce when it is a bug.
  * Make sure you fill in the earliest version that you know has the issue.
* Fork the repository on GitHub.

## Making Changes

* Create a topic branch from where you want to base your work.
  * This is usually the master branch.
  * Only target release branches if you are certain your fix must be on that
    branch.
  * To quickly create a topic branch based on master, run `git checkout -b
    fix/master/my_contribution master`. Please avoid working directly on the
    `master` branch.
* Make commits of logical and atomic units.
* Check for unnecessary whitespace with `git diff --check` before committing.
* Make sure your commit messages are in the proper format. If the commit
  addresses an issue filed in [JIRA](https://bloombox.atlassian.net), start
  the first line of the commit with the issue number in parentheses. If it
  references an issue on GitHub, enclose note it somewhere in the commit body
  as `Bloombox/Java#issue-number`, for example `Bloombox/Java#1`.

  ```
      (PUP-1234) Make the example in CONTRIBUTING imperative and concrete

      Without this patch applied the example commit message in the CONTRIBUTING
      document is not a concrete example. This is a problem because the
      contributor is left to imagine what the commit message should look like
      based on a description rather than an example. This patch fixes the
      problem by making the example concrete and imperative.

      The first line is a real-life imperative statement with a ticket number
      from our issue tracker. The body describes the behavior without the patch,
      why this is a problem, and how the patch fixes the problem when applied.
  ```
* Make sure you have added the necessary tests for your changes.
* Run _all_ the tests to assure nothing else was accidentally broken.

## Submitting Changes

* Sign the CLA.
* Push your changes to a topic branch in your fork of the repository.
* Submit a pull request to the repository in the `bloombox` organization.

## Revert Policy

By running tests in advance and by engaging with peer review for prospective
changes, your contributions have a high probability of becoming long lived
parts of the the project. After being merged, the code will run through a
series of testing pipelines on a large number of operating system
environments. These pipelines can reveal incompatibilities that are difficult
to detect in advance.

If the code change results in a test failure, we will make our best effort to
correct the error. If a fix cannot be determined and committed within 24 hours
of its discovery, the commit(s) responsible _may_ be reverted, at the
discretion of the committer and Bloombox staff. This action would be taken
to help maintain passing states in our testing pipelines.

The original contributor will be notified of the revert in the Jira ticket
associated with the change. A reference to the test(s) and operating system(s)
that failed as a result of the code change will also be added to the Jira
ticket. This test(s) should be used to check future submissions of the code to
ensure the issue has been resolved.

### Summary

* Changes resulting in test pipeline failures will be reverted if they cannot
  be resolved within one business day.

## Additional Resources

* [Bug tracker (Jira)](https://bloombox.atlassian.net)
* [General GitHub documentation](https://help.github.com/)
* [GitHub pull request documentation](https://help.github.com/articles/creating-a-pull-request/)
