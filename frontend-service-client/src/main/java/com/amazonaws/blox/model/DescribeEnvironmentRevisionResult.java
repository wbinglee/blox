/**

*/
package com.amazonaws.blox.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/DescribeEnvironmentRevision"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentRevisionResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private EnvironmentRevision environmentRevision;

    /**
     * @param environmentRevision
     */

    public void setEnvironmentRevision(EnvironmentRevision environmentRevision) {
        this.environmentRevision = environmentRevision;
    }

    /**
     * @return
     */

    public EnvironmentRevision getEnvironmentRevision() {
        return this.environmentRevision;
    }

    /**
     * @param environmentRevision
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentRevisionResult environmentRevision(EnvironmentRevision environmentRevision) {
        setEnvironmentRevision(environmentRevision);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEnvironmentRevision() != null)
            sb.append("EnvironmentRevision: ").append(getEnvironmentRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentRevisionResult == false)
            return false;
        DescribeEnvironmentRevisionResult other = (DescribeEnvironmentRevisionResult) obj;
        if (other.getEnvironmentRevision() == null ^ this.getEnvironmentRevision() == null)
            return false;
        if (other.getEnvironmentRevision() != null && other.getEnvironmentRevision().equals(this.getEnvironmentRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentRevision() == null) ? 0 : getEnvironmentRevision().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentRevisionResult clone() {
        try {
            return (DescribeEnvironmentRevisionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
