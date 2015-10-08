package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.exception.InvalidOauthTokenException;
import edu.ksu.canvas.model.Enrollment;

import java.io.IOException;
import java.util.List;

/**
 * Created by prv on 10/8/15.
 */
public interface EnrollmentsReader {
    /**
     *
     * @param oauthToken
     * @param user_Id
     * @return
     * @throws InvalidOauthTokenException
     * @throws IOException
     */
    public List<Enrollment> getUserEnrollments(String oauthToken, Integer user_Id) throws InvalidOauthTokenException, IOException;

}