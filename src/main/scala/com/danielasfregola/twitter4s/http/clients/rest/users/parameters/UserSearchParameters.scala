package com.danielasfregola.twitter4s.http.clients.rest.users.parameters

import com.danielasfregola.twitter4s.http.marshalling.Parameters

private[twitter4s] case class UserSearchParameters(q: String,
                                                   page: Int,
                                                   count: Int,
                                                   include_entities: Boolean) extends Parameters
