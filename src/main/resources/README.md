
## API client resources

Resources enclosed are embedded in the Bloombox client JAR:

- `README.md`: this file, trimmed during build (so, not included in the final JAR)
- `authority-roots.pem`: default authority roots file
- `bloombox-client-key.json.enc`: encrypted copy of the Bloombox client key, decrypted upon build and embedded
  in the resulting JAR as `/bloombox-client-key.json`
  

### About the client key

You might ask, aren't we crazy, shipping a decrypted key with the JAR??? No, we're not crazy. The key is tightly scoped
to allow the Bloombox client to communicate with certain APIs.

Along with the key, the following rights are present:

- `encryptor`: You can encrypt data with a specific Bloombox key and send it to Bloombox securely.
- `error-reporter`: The library will submit error reports automatically.
- `publisher`: The library can use an optimized interface for event publishing.
