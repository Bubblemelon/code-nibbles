// let L be the length of the original message, and M be the smallest square
// number greater than or equal to L. Add (M−L) asterisks to the message,
// giving a padded message with length M. Use the padded message to fill
// a table of size K×K, where K2=M
//
// Rotate the table 90 degrees clockwise.
// The encrypted message comes from reading the message in row-major order from
// the rotated table, omitting any asterisks.

// Input
// The first line of input is the number of original messages, 1≤N≤100.
// The following N lines each have a message to encrypt.
// Each message contains only characters a–z (lower and upper case),
// and has length 1≤L≤10000.

// Output
// For each original message, output the secret message.

// sample 1 file contents
// 2
// iloveyoutooJill
// TheContestisOver
//
// returns:
//
// iteiloylloooJuv
// OsoTvtnheiterseC

/* To show 90 degree clockwise rotation:

 i l o v
 e y o u
 J a c k
 * * * *

 * J e i
 * a y l
 * c o o
 * k u v

 */

// compile:
// g++ SecretMessage.cpp -o sm
// test:
// ./sm < sometestfile.in

// source
// https://open.kattis.com/problems/secretmessage

#include <iostream>
using namespace std;

int main(void) {


}
